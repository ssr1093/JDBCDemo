package com;

import java.sql.*;



public class demo {
	public static void main(String[] args) {
		Connection conn= null;
		Statement mystat = null;
		ResultSet myrs = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
					"student", "student");
			System.out.println("Success");
			mystat = conn.createStatement();
			myrs = mystat.executeQuery("Select * from employees");
			while(myrs.next()) {
				System.out.println(myrs.getString("first_name")+" Salary is "
						+ ""+myrs.getFloat("salary"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	
}

}
