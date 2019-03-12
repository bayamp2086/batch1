package com.bayamp.sonia.training.objects;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements CarParkingInterface {

	private List<Car> list = new ArrayList<Car>();
	private static int remainingparkcounter = 10;
	private static int totalparkcounter = 0;

	@Override
	public void park(Car c) {
		// TODO Auto-generated method stub
		totalparkcounter++;
		remainingparkcounter--;
		list.add(c);

	}

	public int countParkedCar() {

		return totalparkcounter;

	}

	public int countRemainingParking() {

		return remainingparkcounter;

	}

	public int totalParking() {

		return totalparkcounter + remainingparkcounter;

	}

	public void removePark(Car c) {

		totalparkcounter--;
		remainingparkcounter++;
		list.remove(c);

	}

	public List<Car> carList() {
		// TODO Auto-generated method stub
		return list;
	}

}
