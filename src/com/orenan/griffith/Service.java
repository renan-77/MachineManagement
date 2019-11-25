package com.orenan.griffith;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Service {
	private int serviceID;
	private int machineID;
	private int engineerID;
	private	LocalDate serviceDate;
	private String serviceComments;
	private	String dayOfService;
	private	LocalDate serviceDueDate;
	private	Time timeSpentOnService;
	private String itemsUsed;
	private boolean wasCritical;
	
	MySqlCon dbConnect = new MySqlCon();
	
	public Service(int machineID, int engineerID, LocalDate svcDate, String serviceComments,
			String dayOfService, LocalDate dueDate, Time timeSpentOnService, String itemsUsed, boolean critical) {
		super();
		this.machineID = machineID;
		this.engineerID = engineerID;
		this.serviceDate = svcDate;
		this.serviceComments = serviceComments;
		this.dayOfService = dayOfService;
		this.serviceDueDate = dueDate;
		this.timeSpentOnService = timeSpentOnService;
		this.itemsUsed = itemsUsed;
		this.wasCritical = critical;
	}
	
	public void newRegister() {
		dbConnect.newRegister(machineID, engineerID, serviceDate, serviceComments, dayOfService, serviceDueDate, timeSpentOnService, itemsUsed, wasCritical);
	}

}
