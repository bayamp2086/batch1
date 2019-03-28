package com.bayamp.archana.training.inheritance;

public class AddressForPerson {
	private String unitNo;  
	private String streetName;
	private String city;
	private String state;
	private String zipcode; 

	AddressForPerson(String unitNo, String street, String city, String State, String zipcode) {
		this.city = city;
		this.state = State;
		this.streetName = street;
		this.unitNo = unitNo;
		this.zipcode = zipcode;
	}
	
	public String toString() {
		return this.city +","+this.state +","+ this.streetName+","+this.unitNo +","+this.zipcode ;
	}
}
