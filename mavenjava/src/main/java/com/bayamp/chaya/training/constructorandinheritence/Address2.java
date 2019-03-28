package com.bayamp.chaya.training.constructorandinheritence;

public class Address2 {
	private String UnitNumber;
	private String StreetNumber;
	private String City;
	private String State;
	private String PinCode;

	public Address2(String unitNumber, String streetNumber, String city, String state, String pinCode) {
		this.UnitNumber = unitNumber;
		this.StreetNumber = streetNumber;
		this.City = city;
		this.State = state;
		this.PinCode = pinCode;

	}

	@Override
	public String toString() {
		return (UnitNumber + " " + StreetNumber + "\n" + City + "\n" + State + " " + PinCode);
	}

}
