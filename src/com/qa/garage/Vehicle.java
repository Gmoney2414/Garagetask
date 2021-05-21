package com.qa.garage;

public abstract class Vehicle {
	public int mileague;
	public String manufactor;
	public String engineSize;
	
	public Vehicle(int mileague, String manufactor, String engineSize) {
		this.mileague = mileague;
		this.manufactor = manufactor;
		this.engineSize = engineSize;
		
	}

	public int getMileague() {
		return mileague;
	}

	public void setMileague(int mileague) {
		this.mileague = mileague;
	}

	public String getManufactor() {
		return manufactor;
	}

	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	
 
}

