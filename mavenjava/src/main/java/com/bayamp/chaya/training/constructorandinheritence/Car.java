package com.bayamp.chaya.training.constructorandinheritence;

public class Car {
	private String carName;
	private String ownerName;

	public Car(String carName, String ownerName) {
		this.carName = carName;
		this.ownerName = ownerName;

	}

	@Override
	public String toString() {
		return ("\nCar Name: " + carName + "\nOwner Name: " + ownerName);
	}

}
