package com.bayamp.chaya.training.constructorandinheritence;

public class Bike {
	private String bikeName;
	private String bikeOwner;

	public Bike(String bikeName, String bikeOwner) {
		this.bikeName = bikeName;
		this.bikeOwner = bikeOwner;
	}

	@Override
	public String toString() {
		return ("\nBike Name: " + bikeName + "\nOwner Name: " + bikeOwner);
	}

}
