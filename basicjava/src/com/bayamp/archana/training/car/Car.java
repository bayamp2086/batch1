package com.bayamp.archana.training.car;

public class Car {
	String carModel1;
	String carOwner;

	public Car(String carModel, String owner) {
		this.carModel1 = carModel;
		this.carOwner = owner;
	}
	
	public String getCarModel1() {
		return carModel1;	
	}
	
	public String getCarOwner() {
		return carOwner;	
	}

	public String toString() {
		return this.carModel1 + " "+ this.carOwner;
		
	}
}
