package com.bayamp.chaya.training.constructorandinheritence;

public class Address {
	private String UnitNumber;
	private String StreetNumber;
	private String City;
	private String State;
	private String PinCode;
	
	

	
	public String toString(){
		return(UnitNumber +" "+ StreetNumber + "\n"+City + "\n"+State + " "+ PinCode);
	}

	public String getUnitNumber() {
		return UnitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		UnitNumber = unitNumber;
	}

	public String getStreetNumber() {
		return StreetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		StreetNumber = streetNumber;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}

}



