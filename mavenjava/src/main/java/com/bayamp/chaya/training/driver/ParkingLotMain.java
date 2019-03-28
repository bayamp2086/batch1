package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.constructorandinheritence.Car;
import com.bayamp.chaya.training.constructorandinheritence.ParkingLot;

public class ParkingLotMain {

	public static void main(String[] args) {
		String nameOfTheCar = new String("Dodge Challenger");
		String nameOfTheOwner = new String("Chaya");
		Car c1 = new Car(nameOfTheCar, nameOfTheOwner);
		String nameOfTheCar2 = new String("Mustang");
		String nameOfTheOwner2 = new String("Shashi");
		Car c2 = new Car(nameOfTheCar2, nameOfTheOwner2);

		

		ParkingLot sanJoseParkinglot = new ParkingLot(c1, 2);
		ParkingLot sanJoseParkinglot1 = new ParkingLot(c2, 3);

		sanJoseParkinglot.park(c1);
		sanJoseParkinglot1.park(c2);

		System.out.println("Total number of Car's parked: " + ParkingLot.totalNumberOfCarParked);

		System.out.println("Total number of slot availaible for parking: " + ParkingLot.totalNumberOfParkingSlots);

	}

}
