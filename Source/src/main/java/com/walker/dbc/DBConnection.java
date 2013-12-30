package com.walker.dbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private static String DBDRIVER="com.mysql.jdbc.Driver" ;
	private static String DBURL="jdbc:mysql://localhost:3306/sms?characterEncoding=UTF-8" ;
	private static String DBUSER="root" ;
	private static String DBPASSWORD="" ;
	private static Connection conn=null ;
	
	public Connection getConnection() {
		try {
			Class.forName(DBDRIVER) ;
			if(conn == null){
				conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
			}
		} catch (Exception e) {
			System.out.println("vv"+e.getMessage());
		}
		return conn ;
	}

	public void close() {
		try {
			this.conn.close() ;
		}
		catch (Exception e) {
		}
	}
	
}
