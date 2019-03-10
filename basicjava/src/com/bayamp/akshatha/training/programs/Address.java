package com.bayamp.akshatha.training.programs;

public class Address {
private String addresss;
	
	public Address() {
		this.addresss =getDriver();
	}

	public String getAddress(){
		return this.addresss;
	}
	
	private String getDriver(){
		return FiringWebDriver.getDriver();
		
	}
}
