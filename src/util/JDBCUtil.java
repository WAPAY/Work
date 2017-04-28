package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCUtil {
	public static String url = "jdbc:jtds:sybase://192.168.68.80:5000;DatabaseName=WSCQ;charset=cp936";
	public static String driver="net.sourceforge.jtds.jdbc.Driver";

	private static int countConn;

	
	public  static Connection getConnection() throws Exception{
		Connection conn = null;
		Class.forName(driver);
		conn = DriverManager.getConnection(url, "sa", "");
		
		return conn;
	}

	public static void main(String[] args) throws Exception {
		
	}
}
