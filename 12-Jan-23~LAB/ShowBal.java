package com.BMS1.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.BMS1.Helper;


public class ShowBal {
	int db_acc, db_pin;

	public void fetchAccountDetails(int acc_no, int pin) throws SQLException {
		Connection conn2 = Helper.con();
		Statement stmt = conn2.createStatement(); // create statement
		// execute query fetch data from database
		ResultSet rs = stmt.executeQuery("select * from Bank where acc_no =" + acc_no + " and pin =" + pin);
		// iteration
		while (rs.next()) { // getting of the column of each record of table
			db_acc = rs.getInt(1);
			db_pin = rs.getInt(7);

		}
		if (db_acc != acc_no) {
			System.err.println("!! WRONG ACCOUNT NUMBER INSERTED !!");
		}
		if (db_pin != pin) {
			System.err.println("!! WRONG PIN INSERTED !!");
		}

		else {
			System.err.println("__________");
			System.out.println("_Details of your Account_");
			ResultSet rs1 = stmt.executeQuery("select * from Bank where pin =" + pin);
			while (rs1.next()) {
				System.err.println("Account Number: " + rs.getInt(1) + "Account Holder: " + rs.getString(2)
						+ "Branch IFSC: " + rs.getString(3) + "Branch: " + rs.getString(4) + "Account Type: "
						+ rs.getString(5) + "Account Balance: " + rs.getDouble(6) + "Account Pin: " + rs.getInt(7));
				System.err.println("Data inserted & saved successfully------------------");
			}
		}

	}


}
