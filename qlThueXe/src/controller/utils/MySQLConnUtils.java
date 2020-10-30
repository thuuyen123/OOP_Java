package controller.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class MySQLConnUtils {
	 public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
		 String hostname = "localhost";
		 String dbName = "mydb";
		 String userName = "root";
		 String pass = "";
		return getMySQLConnection(hostname, dbName, userName, pass);
		 
	 }
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	     Class.forName("com.mysql.jdbc.Driver");
	 
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName+"?zeroDateTimeBehavior=convertToNull";
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}
