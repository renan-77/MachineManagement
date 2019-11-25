package com.orenan.griffith;

import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlCon {
	//Connection details for database (JDBC).
		private static String url = "jdbc:mysql://127.0.0.1:8888/MachineMaintenance";
		private static String usr = "root";
		private static String pass = "root";
		
		public void newRegister(int machineID, int engineerID, LocalDate svcDate, String serviceComments,
				String dayOfService, LocalDate dueDate, Time timeSpentOnService, String itemsUsed, boolean critical) {
			try {
				//Calling the driver, Connecting to the database and creating the statement.
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url);
				Statement myStmt = con.createStatement();					
				
				//Passing the command to the database to add the student based on the input.
				String sql = String.format("insert into Services" 
						+" (machineID, engineerID, serviceDate, serviceComments, dayOfService, serviceDueDate, timeSpentOnService, ItemsUsed, wasCritical)"
						+" values ('%d','%d' ,'%t', '%s', '%s', '%t', '%s', '%b')", machineID, engineerID, svcDate, serviceComments, dayOfService, dueDate, timeSpentOnService, itemsUsed, critical);
				
				//Executes the query.
				myStmt.executeUpdate(sql);
				
				//Confirms that the user was added as a console prompt.
				System.out.println("New Register Completed.");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
