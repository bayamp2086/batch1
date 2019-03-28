package com.bayamp.archana.training.objects;

public class Address {

	private String unitNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	
	
 public Address(String unit, String sName, String city, String state, String zCode) {
		this.unitNumber = unit;
		this.streetName = sName;
		this.city = city;
		this.state = state;
		this.zipCode = zCode;
       // System.out.println(unit+","+sName+","+city+","+state+","+zCode);
	}

public String toString() {
    return this.unitNumber + "," + this.streetName+ "," +this.city+ "," +this.state+ "," + this.zipCode;
}
}



