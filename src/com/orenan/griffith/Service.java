package com.orenan.griffith;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Service {
	private int serviceID;
	private int machineID;
	private int engineerID;
	private	Date serviceDate;
	private String serviceComments;
	private	String dayOfService;
	private	Date serviceDueDate;
	private	String timeSpentOnService;
	private String itemsUsed;
	private int wasCritical;
	
	//Instantiating MySqlCon
	MySqlCon dbConnect = new MySqlCon();
	
	//Constructor.
	public Service(int machineID, int engineerID, Date svcDate, String serviceComments,
			String dayOfService, Date dueDate, String timeSpentOnService, String itemsUsed, int critical) {
		System.out.println("Creating Register");
		this.machineID = machineID;
		this.engineerID = engineerID;
		this.serviceDate = svcDate;
		this.serviceComments = serviceComments;
		this.dayOfService = dayOfService;
		this.serviceDueDate = dueDate;
		this.timeSpentOnService = timeSpentOnService;
		this.itemsUsed = itemsUsed;
		this.wasCritical = critical;
		System.out.println("Register Created");
	}
	
	//Method that displays the object as a String. 
	public String displayObj() {
		String obj = String.format("Machine ID: %d, Engineer ID: %d, Service Date: %s, Service Comments: %s, dayOfService: %s, "
				+ "Due Date: %s, Time Spent: %s, Items Used: %s, Was Critical: %d", machineID, engineerID, serviceDate.toString(), serviceComments, dayOfService.toString(), serviceDueDate.toString(), timeSpentOnService, itemsUsed, wasCritical);
		return obj;
	}
	
	//Calling newRegister method from connection.
	public void newRegister(){
		dbConnect.newServiceRegister(machineID, engineerID, serviceDate, serviceComments, dayOfService, serviceDueDate, timeSpentOnService, itemsUsed, wasCritical);
	}

}
