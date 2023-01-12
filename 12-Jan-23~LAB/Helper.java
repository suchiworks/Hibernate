package com.BMS1;

/*/**
 * Hello world!
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	static {
		try {
			//register my sql driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	//build connection
	public static Connection con1()throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/akshaya_db", "Akshaya","Ak@80933");
	}
	public static Connection con() {
		// TODO Auto-generated method stub
		return null;
	}
}




