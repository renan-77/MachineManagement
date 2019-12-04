package com.orenan.griffith;

import java.sql.Date;

public class Machine {
	private String machineName;
	private	String machineDescription;
	private Date purchaseDate;
	private int isActive;
	private int serviceFrequency;
	private int flagSeverity;
	
	MySqlCon dbConnect = new MySqlCon();
	
	public Machine(String machineName, String machineDescription, Date purchaseDate, int isActive, int serviceFrequency,
			int flagSeverity) {
		super();
		this.machineName = machineName;
		this.machineDescription = machineDescription;
		this.purchaseDate = purchaseDate;
		this.isActive = isActive;
		this.serviceFrequency = serviceFrequency;
		this.flagSeverity = flagSeverity;
	}
	
	public String displayObj(){
		String obj = String.format("Machine name: %s, Machine description: %s, Purchase Date: %s, Is machine active: %d, "
				+ "Service Frequency per Year: %d, Flag Severity: %d", machineName, machineDescription, purchaseDate, isActive, serviceFrequency, flagSeverity);
		return obj;
	}
	
	public void newRegister(){
		dbConnect.newMachineRegister(machineName, machineDescription, purchaseDate, isActive, serviceFrequency, flagSeverity);
	}
}
