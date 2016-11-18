package Mybatis.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dubo on 16/11/17.
 * 构建SQLSession接口的实例
 */
public class MyBatisSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory getSqlSessionFactory(){
        if (sqlSessionFactory==null){
            InputStream inputStream= null;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            return sqlSessionFactory;
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSqlSession(boolean autoCommit){

        return getSqlSessionFactory().openSession(autoCommit);
    }
    public static SqlSession getSqlSession(){
        return getSqlSession(false);
    }
}
