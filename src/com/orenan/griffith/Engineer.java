package com.orenan.griffith;

public class Engineer {	
	private String engineerName;

	//Instantiating connection.
	MySqlCon dbConnect = new MySqlCon();
	
	public Engineer(String engineerName) {
		super();
		this.engineerName = engineerName;
	}

	//Display object as a String.
	public String displayObj() {
		String obj = "Engineer Name: " + engineerName;
		return obj;
	}
	
	//Add to database.
	public void newRegister() {
		dbConnect.newEngineerRegister(engineerName);
	}
	
}
