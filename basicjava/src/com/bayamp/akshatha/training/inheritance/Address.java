package com.bayamp.akshatha.training.inheritance;

public class Address {

	private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    
    
	public Address(String streetAddress, String city, String zipcode, String state) {
		// TODO Auto-generated constructor stub
		this.streetAddress=streetAddress;
		this.city=city;
		this.zipCode=zipcode;
		this.state=state;
	}
	
	@Override
	public String toString() {
		return streetAddress +" "+ city +" "+ zipCode +" "+ state ;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
    
    
}
