package com.bayamp.archana.training.car;

import java.util.Set;
import java.util.TreeSet;

public class CarProgram {

	public static void main(String[] args) {
		
		Car c1 = new Car("Testla", "Harish");
		Car c2 = new Car("Camry","Archana");
		Car c3 = new Car("Challenger","Sofia");
		Car c4 = new Car("Honda","Arya");
		Car c5 = new Car("Camry","Priya");
		Car c6 = new Car("Civic","Aisha");
		ParkingLot sanJoseParkingLot = new ParkingLot();
		sanJoseParkingLot.park(c1);
		sanJoseParkingLot.park(c2);
		sanJoseParkingLot.park(c3);
		sanJoseParkingLot.park(c4);
		sanJoseParkingLot.park(c5);
		
		sanJoseParkingLot.getParkedCars();
		
//		ParkingLot milpitasParkingLot = new ParkingLot();
//		milpitasParkingLot.park(c2);
		
		Set<Car> myCarList = new TreeSet<Car>();
		myCarList.add(c1);
	}
}
