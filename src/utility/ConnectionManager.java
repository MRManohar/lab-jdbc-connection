package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public Connection getConnectionManager() throws Exception {
		
		Properties pro = loadPropertiesFile();
		
		String driver = pro.getProperty("driver");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		return con; 
	}
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}
