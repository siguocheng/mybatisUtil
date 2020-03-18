package ${package_name}.service.impl;

import ${modelTargetPackage}.${table_name};
import ${package_name}.service.${table_name}Service;
import ${daoTargetPackage}.${table_name}Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 描述：${table_annotation} 服务实现层
* @author ${author}
* @date ${date}
*/
@Service
public class ${table_name}ServiceImpl implements ${table_name}Service{

    @Autowired
    private ${table_name}Mapper ${table_name?uncap_first}Mapper;

    @Override
    public ${table_name} select${table_name}ByPrimaryKey(${primaryKeyType} id) {
        ${table_name} ${table_name?uncap_first} = ${table_name?uncap_first}Mapper.selectByPrimaryKey(id);
        return ${table_name?uncap_first};
    }
    
    @Override
    public int delete${table_name}ByPrimaryKey(${primaryKeyType} id) {
        return ${table_name?uncap_first}Mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert${table_name}Selective(${table_name} record) {
        return ${table_name?uncap_first}Mapper.insertSelective(record);
    }
    
    @Override
    public int update${table_name}Selective(${table_name} record) {
        return ${table_name?uncap_first}Mapper.updateByPrimaryKeySelective(record);
    }
}
