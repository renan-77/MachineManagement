package com.orenan.griffith;

public class Engineer {	
	private String engineerName;

	MySqlCon dbConnect = new MySqlCon();
	
	public Engineer(String engineerName) {
		super();
		this.engineerName = engineerName;
	}

	public String displayObj() {
		String obj = "Engineer Name: " + engineerName;
		return obj;
	}
	
	public void newRegister() {
		dbConnect.newEngineerRegister(engineerName);
	}
	
}
