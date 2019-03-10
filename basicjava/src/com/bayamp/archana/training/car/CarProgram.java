package com.bayamp.archana.training.car;

public class CarProgram {

	public static void main(String[] args) {
		
		Car c1 = new Car("Testla", "Harish");
		Car c2 = new Car("Camry","Archana");
		Car c3 = new Car("Sofia","Challenger");
		
		ParkingLot sanJoseParkingLot = new ParkingLot();
		sanJoseParkingLot.park(c1);
		sanJoseParkingLot.park(c2);
		sanJoseParkingLot.park(c3);
		
		sanJoseParkingLot.getParkedCars();
		
		
		
//		ParkingLot milpitasParkingLot = new ParkingLot();
//		milpitasParkingLot.park(c2);
	}
}
