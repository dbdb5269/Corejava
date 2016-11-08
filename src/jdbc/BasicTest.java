package jdbc;

import oracle.jdbc.driver.OracleDriver;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by dubo on 16/11/7.
 */
public class BasicTest {
    @Test
    public void basc_jdbc(){
        //1.注册驱动
        //1.1类加载
        //1.2构建Driver对象
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Driver oracleDriver = new OracleDriver();
//            //register dirver 可以忽略

//
            DriverManager.registerDriver(oracleDriver);
            Properties info=new Properties();
            info.load(new FileInputStream(new File("./oracle.properties")));
            String url=info.getProperty("url");
            //System.out.println(url);
            String user=info.getProperty("user");
            String password=info.getProperty("password");
            Connection connection = DriverManager.getConnection(url, user, password);
            //System.out.println(connection);
            String sql="select id,last_name from s_emp";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            //executeQuery
//            execute
//            executeUpdate
            ResultSet resultSet = pstmt.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
