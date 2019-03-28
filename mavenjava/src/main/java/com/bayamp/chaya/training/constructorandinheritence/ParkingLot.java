package com.bayamp.chaya.training.constructorandinheritence;

public class ParkingLot {
	private Car car;
	private Bike bike;
	private int parkingSlotNumber;
	public static int totalNumberOfParkingSlots = 1000;
	public static int totalNumberOfCarParked;

	public ParkingLot(Car car, int parkingSlotNumber) {
		this.car = car;
		this.parkingSlotNumber = parkingSlotNumber;
		totalNumberOfParkingSlots--;
		totalNumberOfCarParked++;

	}

	public void park(Car c) {
		System.out.println("Parking Slot Details: " + parkingSlotNumber + c);
	}
}
