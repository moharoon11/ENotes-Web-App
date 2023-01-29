package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	
	private static Connection conn;

	public static Connection getConn() throws ClassNotFoundException, SQLException {
          if(conn==null) {
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  conn = DriverManager.getConnection("jdbc:mysql:///enotes", "root" , "root123");
          }
          return conn;
	}
	
}
