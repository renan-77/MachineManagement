package com.orenan.griffith;

import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

public class MySqlCon {
	//Connection details for database (JDBC).
		private static String url = "jdbc:mysql://localhost:8889/MachineMaintenance";
		private static String usr = "renan";
		private static String pass = "000";
		
		//Method to Register New Service.
		public void newServiceRegister(int machineID, int engineerID, Date svcDate, String serviceComments,
				String dayOfService, Date dueDate, String timeSpentOnService, String itemsUsed, int critical) {
			try {
				//Calling the driver, Connecting to the database and creating the statement.
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, usr, pass);
				Statement myStmt = con.createStatement();					
				
				//Passing the command to the database to add the student based on the input.
				String sql = String.format("INSERT INTO `Services` (`serviceID`, `machineID`, `engineerID`, `serviceDate`, `serviceComments`, "
						+ "`dayOfService`, `serviceDueDate`, `timeSpentOnService`, `ItemsUsed`, `wasCritical`) "
						+ "VALUES (NULL, %d, %d, '%s', '%s', '%s', '%s', '%s', '%s', '%d');", machineID, engineerID, svcDate, serviceComments,
						dayOfService, dueDate, timeSpentOnService, itemsUsed, critical);
				
				System.out.println(sql);
				
				
				
				//Executes the query.
				myStmt.executeUpdate(sql);
				
				//Confirms that the user was added as a console prompt.
				System.out.println("New Service Added.");
				JOptionPane.showMessageDialog(null, "New Service Added");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Method to Register New Machine.
		public void newMachineRegister(String mchName, String mchDescription, Date buyDate, int isActive, int frequency, int essentialMch) {
			try {
				//Calling the driver, Connecting to the database and creating the statement.
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, usr, pass);
				Statement myStmt = con.createStatement();					
				
				//Passing the command to the database to add the student based on the input.
				String sql = String.format("INSERT INTO `Machines` (`machineID`, `machineName`, `machineDescription`, `purchaseDate`, "
						+ "`isActive`, `serviceFrequency`, `flagSeverity`) "
						+ "VALUES (NULL, '%s', '%s', '%s', '%d', '%d', '%d');", mchName, mchDescription, buyDate, isActive, frequency, essentialMch);
				
				System.out.println(sql);
				
				
				
				//Executes the query.
				myStmt.executeUpdate(sql);
				
				//Confirms that the user was added as a console prompt.
				System.out.println("New Machine Added.");
				JOptionPane.showMessageDialog(null, "New Machine Added");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Method to Register New Engineer.
		public void newEngineerRegister(String engName) {
			try {
				//Calling the driver, Connecting to the database and creating the statement.
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, usr, pass);
				Statement myStmt = con.createStatement();					
				
				//Passing the command to the database to add the student based on the input.
				String sql = String.format("INSERT INTO `Engineers` (`engineerID`,`engineerName`, `engineerRate` ) "
						+ "VALUES (NULL, '%s', NULL);", engName);
				
				System.out.println(sql);
				
				
				
				//Executes the query.
				myStmt.executeUpdate(sql);
				
				//Confirms that the user was added as a console prompt.
				System.out.println("New Engineer Added.");
				JOptionPane.showMessageDialog(null, "New Engineer Added");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
