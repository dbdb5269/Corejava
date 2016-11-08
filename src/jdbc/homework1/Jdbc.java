package jdbc.homework1;

import ch05.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Created by dubo on 16/11/7.
 */
public class Jdbc {
    public static void main(String[] args) {
        Properties info=new Properties();
        try {
            info.load(new FileInputStream(new File("./oracle.properties")));
            String url=info.getProperty("url");
            String user=info.getProperty("user");
            String password=info.getProperty("password");
            String dirverClass=info.getProperty("dirverClass");
            Class.forName(dirverClass);
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="insert into dubo_user values(1,'dubo',20)";
            String sql2="insert into dubo_user values(2,'dubo',20)";
            String sql3="insert into dubo_user values(3,'dubo',20)";
            String sql4="insert into dubo_user values(4,'dubo',20)";
            String sql5="insert into dubo_user values(5,'dubo',20)";
            String sql6="insert into dubo_user values(6,'dubo',20)";
            String sql7="insert into dubo_user values(7,'dubo',20)";
            String sql8="insert into dubo_user values(8,'dubo',20)";
            String sql9="insert into dubo_user values(9,'dubo',20)";
            String sql10="insert into dubo_user values(10,'dubo',20)";
            PreparedStatement statement = connection.prepareStatement(sql);
            PreparedStatement statement2 = connection.prepareStatement(sql2);
            PreparedStatement statement3= connection.prepareStatement(sql3);
            PreparedStatement statement4= connection.prepareStatement(sql4);
            PreparedStatement statement5= connection.prepareStatement(sql5);
            PreparedStatement statement6= connection.prepareStatement(sql6);
            PreparedStatement statement7= connection.prepareStatement(sql7);
            PreparedStatement statement8= connection.prepareStatement(sql8);
            PreparedStatement statement9= connection.prepareStatement(sql9);
            PreparedStatement statement10= connection.prepareStatement(sql10);

            statement.execute();
            statement2.execute();
            statement3.execute();
            statement4.execute();
            statement5.execute();
            statement6.execute();
            statement7.execute();
            statement8.execute();
            statement9.execute();
            statement10.execute();
            String select="select * from dubo_user";
            PreparedStatement statement11= connection.prepareStatement(select);

            ResultSet resultSet = statement11.executeQuery();
            while (resultSet.next()){
                System.out.println("id= "+resultSet.getInt("id")+"  "+"name= "+resultSet.getString("name")+"   "+"age= "+resultSet.getString("age"));
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            String update="update dubo_user set name='IBM' where id=4";
            PreparedStatement statement12= connection.prepareStatement(update);

            statement12.execute();
            String delete="delete from dubo_user where id=5";
            PreparedStatement statement_delete= connection.prepareStatement(delete);

            statement_delete.execute();

            String select2="select * from dubo_user";
            PreparedStatement statement13= connection.prepareStatement(select);

            ResultSet resultSet2 = statement13.executeQuery();
            while (resultSet2.next()){
                System.out.println("id= "+resultSet2.getInt("id")+"  "+"name= "+resultSet2.getString("name")+"   "+"age= "+resultSet2.getString("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
