package com.bayamp.sonia.training.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bayamp.sonia.training.utils.SystemPrintClass;

public class ParkingLot implements CarParkingInterface {

	private List<Car> list = new ArrayList<Car>();
	private static int totalParkingCounter=10;
	private static int remainingparkcounter = totalParkingCounter;
	private static int totalparkcounter = 0;

	@Override
	public void park(Car c) {
		// TODO Auto-generated method stub
		
		if(list.size()==10) {
			
			System.err.print("Parking is Full, You Can Park only 10 Cars");
			remainingparkcounter=0;
			totalparkcounter=10;
		}
		
		if(list.size()<totalParkingCounter) {
			list.add(c);
			totalparkcounter++;
			remainingparkcounter--;
		}
		else {
			remainingparkcounter=0;
			totalparkcounter=totalParkingCounter;
		}
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
