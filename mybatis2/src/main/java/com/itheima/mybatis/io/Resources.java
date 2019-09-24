package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * @data 2019-09-24 :
 **/
public class Resources {
    public static InputStream getResourceAsStream(String filePath){
                   return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
