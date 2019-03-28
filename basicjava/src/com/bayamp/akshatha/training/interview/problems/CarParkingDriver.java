package com.bayamp.akshatha.training.interview.problems;

public class CarParkingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("Toyota", "Archana");
		Car c2 = new Car("Honda", "Chaya");
		Car c3 = new Car("Nissan", "Soniya");

		Car c4 = new Car("Honda", "Akshata");
		Car c5 = new Car("Mazda", "Anuradha");

		ParkingLot sanJoseParkingLot = new ParkingLot(10, "San Jose");
		sanJoseParkingLot.park(c1);
		sanJoseParkingLot.park(c2);
		sanJoseParkingLot.park(c3);

		
		sanJoseParkingLot.park(c4);
		sanJoseParkingLot.removeCar(c2);
		sanJoseParkingLot.getRemainingSpotsCount();

		System.out.println("List of Cars Parked :" + sanJoseParkingLot.getClist());
		sanJoseParkingLot.removeCar(c1);

		ParkingLot milpitasParkingLot = new ParkingLot(7, "Milpitas");
		milpitasParkingLot.park(c1);
		milpitasParkingLot.park(c1);
		milpitasParkingLot.park(c3);
		milpitasParkingLot.removeCar(c2);
		milpitasParkingLot.getRemainingSpotsCount();
		System.out.println("List of Cars Parked at " + milpitasParkingLot.getName() + " Parking Lot: "
				+ milpitasParkingLot.getClist());
	}

}
