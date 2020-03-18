package com.sgc.mybatisG;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.sgc.mybatisG.model.FtlModel;
import com.sgc.mybatisG.util.FreeMarkerTemplateUtils;

import freemarker.template.Template;

public class FreeMarkerApp {

	private final String AUTHOR = "Ay";
    private final String CURRENT_DATE = "2017/05/03";
    private final String tableName = "biz_alarm";
    private final String packageName = "com.sgc.mybatisG";
    private final String tableAnnotation = "质量问题";
    private final String diskPath = "./src/main/java/com/sgc/mybatisG/service/impl/";
    private final String changeTableName = replaceUnderLineAndUpperCase(tableName);
	
    
	public static void main(String[] args) throws Exception {
		
		String classPath = "com.sgc.mybatisG.dao.BizAlarmMapper";
		
		FreeMarkerApp app = new FreeMarkerApp();
		
		FtlModel ftlModel = new FtlModel();
		ftlModel.setModelTargetPackage("com.sgc.mybatisG.model");
		ftlModel.setDaoTargetPackage("com.sgc.mybatisG.dao");
		ftlModel.setXmlTargetPackage("com.sgc.mybatisG.mapper");
		
		ftlModel.setTemplateName("ServiceImpl.ftl");
		ftlModel.setTableName("biz_alarm");
		ftlModel.setDomainObjectName(replaceUnderLineAndUpperCase("biz_alarm"));
		
//		ftlModel.setTargetPath("./src/main/java/com/sgc/mybatisG/service/impl/");
		ftlModel.setTargetPath("com.sgc.mybatisG.service.impl");
		ftlModel.setSuffix("ServiceImpl.java");
		ftlModel.setPrimaryKeyType(getPrimaryKeyType(classPath));
    	app.generateServiceImplFile(ftlModel);
    	
//    	ftlModel.setTargetPath("./src/main/java/com/sgc/mybatisG/service/");
    	ftlModel.setTargetPath("com.sgc.mybatisG.service");
    	ftlModel.setSuffix("Service.java");
    	ftlModel.setTemplateName("Service.ftl");
    	app.generateServiceImplFile(ftlModel);
    	
//    	ftlModel.setTargetPath("./src/main/java/com/sgc/mybatisG/controller/");
    	ftlModel.setTargetPath("com.sgc.mybatisG.controller");
    	ftlModel.setSuffix("Controller.java");
    	ftlModel.setTemplateName("Controller.ftl");
    	
    	app.generateServiceImplFile(ftlModel);
	}

	/**
	 * 获取主键类型
	 * @param classPath
	 * @return
	 * @throws ClassNotFoundException
	 */
	private static String getPrimaryKeyType(String classPath) throws ClassNotFoundException {
		
		Class clazz =Class.forName(classPath);
		
		Method[] methods = clazz.getMethods();
		
		for (int i=0;i<methods.length;i++) {
			if ("selectByPrimaryKey".equals(methods[i].getName())) {
				Class cl = methods[i].getParameterTypes()[0];
				
				return cl.getSimpleName();
			}
		}
		
		return "";
	}
	
	private void generateServiceImplFile(FtlModel ftlModel) throws Exception {

		String targetPath = "./src/main/java/" + ftlModel.getTargetPath().replace(".", "/") + "/";
		
		final String path = targetPath + ftlModel.getDomainObjectName() + ftlModel.getSuffix();
		System.out.println("path:" + path);
		final String templateName = ftlModel.getTemplateName();
		File mapperFile = new File(path);
		Map<String, Object> dataMap = new HashMap<>();
		generateFileByTemplate(templateName, mapperFile, dataMap, ftlModel);
	}
    
    private void generateFileByTemplate(final String templateName,File file,Map<String,Object> dataMap,FtlModel ftlModel) throws Exception{
    	Template template = FreeMarkerTemplateUtils.getTemplate(templateName);
        FileOutputStream fos = new FileOutputStream(file);
        dataMap.put("table_name_small",tableName);
        dataMap.put("table_name",changeTableName);
        dataMap.put("author",AUTHOR);
        dataMap.put("date",CURRENT_DATE);
        dataMap.put("package_name",packageName);
        dataMap.put("table_annotation",tableAnnotation);
        
        dataMap.put("modelTargetPackage",ftlModel.getModelTargetPackage());
        dataMap.put("daoTargetPackage",ftlModel.getDaoTargetPackage());
        dataMap.put("xmlTargetPackage",ftlModel.getXmlTargetPackage());
        
        dataMap.put("primaryKeyType", ftlModel.getPrimaryKeyType());
        Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"),10240);
        template.process(dataMap,out);
    }
    
    public static String replaceUnderLineAndUpperCase(String str){
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int count = sb.indexOf("_");
        while(count!=0){
            int num = sb.indexOf("_",count);
            count = num + 1;
            if(num != -1){
                char ss = sb.charAt(count);
                char ia = (char) (ss - 32);
                sb.replace(count , count + 1,ia + "");
            }
        }
        String result = sb.toString().replaceAll("_","");
        return StringUtils.capitalize(result);
    }
	
}
