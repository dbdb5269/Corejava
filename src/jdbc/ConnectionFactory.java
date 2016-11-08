package jdbc;

public class ConnectionFactory{
	private static Connection conn;
	private static String driverClass;
	private static String url;
	private static String user;
	private static String password;

	public static Connection getConnection(){
		try{
			Properties prop=new Properties();
			prop.load(ConnectionFactory.class.getResourse);
			driverClass=prop.getProperty("driverClass");
			url=prop.getProperty("url");
			user=prop.getProperty("prop");
			password=prop.getProperty("password");

			Class.forName(driverClass);
			Connection conn=DriverManager.getConnection(url,user,password);

		}catch(Exception e){
			e.printStackTrace();
		}
		return conn
	}
}