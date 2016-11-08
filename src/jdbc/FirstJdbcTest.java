package jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dubo on 16/11/7.
 */
public class FirstJdbcTest {
   @Test
    public void first_jdbc(){
        //1.regester diriver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.获取连接对象
            String url="jdbc:oracle:thin:@10.211.55.3:1521:xe";
            Connection connection = DriverManager.getConnection(url, "briup", "briup");
            System.out.println(connection);
            Statement stmt=connection.createStatement();
            String sql="select id,last_name from s_emp";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("last_name");
                System.out.println("id="+id+"  "+"name="+name);
            }
            resultSet.close();
            stmt.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
