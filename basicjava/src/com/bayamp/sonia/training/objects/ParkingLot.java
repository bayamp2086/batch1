package com.bayamp.sonia.training.objects;
import java.util.List;

public class ParkingLot implements CarParkingInterface {

	
   
	
	@Override
	public void park(Car c) {
		// TODO Auto-generated method stub
		c.totalparkcounter++;
		c.remainingparkcounter--;
		c.list.add(c);
		
		
	}
	
	public int countParkedCar() {
		
		
		return Car.totalparkcounter;
		
	}
	
	public int countRemainingParking() {
		
		
		return Car.remainingparkcounter;
		
	}

	@Override
	public void removePark(Car c) {
		
		c.totalparkcounter--;
		c.remainingparkcounter++;
		c.list.remove(c);
		
	}

	@Override
	public List<Car> carList() {
		// TODO Auto-generated method stub
		return Car.list;
	}

	
}
