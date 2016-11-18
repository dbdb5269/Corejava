package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory{
	private static Connection conn;
	private static String driverClass;
	private static String url;
	private static String user;
	private static String password;

	public static Connection getConnection(){
		return null;
	}
}