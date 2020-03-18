package ${package_name}.service;

import ${modelTargetPackage}.${table_name};


/**
* 描述：${table_annotation} 服务实现层
* @author ${author}
* @date ${date}
*/
public interface ${table_name}Service {

    ${table_name} select${table_name}ByPrimaryKey(${primaryKeyType} id);
    
    int delete${table_name}ByPrimaryKey(${primaryKeyType} id);
    
    int insert${table_name}Selective(${table_name} record);
    
    int update${table_name}Selective(${table_name} record);
}
