package ${package_name}.controller;

import ${modelTargetPackage}.${table_name};
import ${package_name}.service.${table_name}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 描述：${table_annotation} 服务实现层
* @author ${author}
* @date ${date}
*/
@RestController
@RequestMapping("${table_name?uncap_first}")
public class ${table_name}Controller {

    @Autowired
    private ${table_name}Service ${table_name?uncap_first}Service;

    
    public ${table_name} select${table_name}ByPrimaryKey(${primaryKeyType} id) {
        ${table_name} ${table_name?uncap_first} = ${table_name?uncap_first}Service.select${table_name}ByPrimaryKey(id);
        return ${table_name?uncap_first};
    }
    
    
    public int delete${table_name}ByPrimaryKey(${primaryKeyType} id) {
        return ${table_name?uncap_first}Service.delete${table_name}ByPrimaryKey(id);
    }
    
    
    public int insert${table_name}Selective(${table_name} record) {
        return ${table_name?uncap_first}Service.insert${table_name}Selective(record);
    }
    
    
    public int update${table_name}Selective(${table_name} record) {
        return ${table_name?uncap_first}Service.update${table_name}Selective(record);
    }
}
