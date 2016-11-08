package jdbc;

import java.sql.*;

/**
 * Created by dubo on 16/11/8.
 */
public class StmtAndPstmt {
    public void stmtSave(int id,String name){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.获取连接对象
        String url="jdbc:oracle:thin:@10.211.55.3:1521:xe";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "briup", "briup");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement stmt= null;
        try {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql="insert into dubo_user values("+id+")";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void pstmtSave(int id,String name){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.获取连接对象
        String url="jdbc:oracle:thin:@10.211.55.3:1521:xe";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "briup", "briup");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql="insert into dubo_user values("+id+",'"+name+"')";
        String sql2="insert into dubo_user values(?,?)";
        PreparedStatement pstmt= null;
        try {
            pstmt = connection.prepareStatement(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.executeUpdate(sql);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void stmtQuery(String name){

    }
    public void pstmtQuery(String name){

    }
}
