package com.sgc.mybatisG.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseUtil {

	public static void main(String[] args) {
		List list = getTableInfo("biz_alarm_detail");
		
		System.out.println(list.size());
	}

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://aosmith-iot-test.database.chinacloudapi.cn:1433;database=iot-sql-srv-east2-test;user=aos_admin_test@aosmith-iot-test";
    private static final String USERNAME = "aos_admin_test";
    private static final String PASSWORD = "passWord#123";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("can not load jdbc driver");
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {

            System.out.println("get connection failure");
        }
        return conn;
    }

    
    
    /**
     * 关闭数据库连接
     * @param conn
     */
    public static void closeConnection(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("close connection failure");
            }
        }
    }
	
	public static List getTableInfo(String table){
		List result = new ArrayList();
		
		Connection conn = null;		
		DatabaseMetaData dbmd = null;
		
		try {
			conn = getConnection();
			
			dbmd = conn.getMetaData();
			ResultSet resultSet = dbmd.getTables(null, "%", table, new String[] { "TABLE" });
			
			while (resultSet.next()) {
		    	String tableName=resultSet.getString("TABLE_NAME");
		    	System.out.println(tableName);
		    	
		    	if(tableName.equals(table)){
					ResultSet rs = conn.getMetaData().getColumns(null, null, tableName, "%");

		    		while(rs.next()){
		    			//System.out.println("字段名："+rs.getString("COLUMN_NAME")+"--字段注释："+rs.getString("REMARKS")+"--字段数据类型："+rs.getString("TYPE_NAME"));
		    			Map map = new HashMap();
		    			String colName = rs.getString("COLUMN_NAME");
		    			map.put("code", colName);
		    			
		    			String remarks = rs.getString("REMARKS");
		    			if(remarks == null || remarks.equals("")){
		    				remarks = colName;
		    			}
		    			map.put("name",remarks);
		    			
		    			String dbType = rs.getString("TYPE_NAME");
		    			map.put("dbType",dbType);
		    			
		    			map.put("valueType", changeDbType(dbType));
		    			result.add(map);
		    		}
		    	}
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	private static String changeDbType(String dbType) {
		dbType = dbType.toUpperCase();
		switch(dbType){
			case "VARCHAR":
			case "VARCHAR2":
			case "CHAR":
				return "1";
			case "NUMBER":
			case "DECIMAL":
				return "4";
			case "INT":
			case "SMALLINT":
			case "INTEGER":
				return "2";
			case "BIGINT":
				return "6";
			case "DATETIME":
			case "TIMESTAMP":
			case "DATE":
				return "7";
			default:
				return "1";
		}
	}
	
	private static String getSchema(Connection conn) throws Exception {
		String schema;
		schema = conn.getMetaData().getUserName();
		System.out.println(schema);
		
		if ((schema == null) || (schema.length() == 0)) {
			throw new Exception("ORACLE数据库模式不允许为空");
		}
//		return schema.toUpperCase().toString();
		return schema;
 
	}
}
