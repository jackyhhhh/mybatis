package com.tarena.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSession getSession(){
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        InputStream config = SqlSessionUtil.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sf = factoryBuilder.build(config);
        return sf.openSession();
    }

}
