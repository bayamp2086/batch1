package com.bayamp.akshatha.training.interview.problems;

public class Car {

	private String make;
	private String ownerName;
	private String reg;

	public Car(String make, String owner) {
		this.make = make;
		this.ownerName = owner;
	}

	@Override
	public String toString() {
		return "Car - " + this.make + " - " + this.ownerName;
	}

}
