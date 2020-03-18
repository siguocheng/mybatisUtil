package com.sgc.mybatisG.util;

import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtil {

    private static Properties p = new Properties();
    
    static {
        try {
            InputStream is = PropertiesUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            p.load(is); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getValue(String key) {
        return p.getProperty(key);
    }
    
    public static void main(String[] args) {
        System.out.println(PropertiesUtil.getValue("jdbc.url"));
    }
}
