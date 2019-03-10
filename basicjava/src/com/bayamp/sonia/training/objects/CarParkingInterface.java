package com.bayamp.sonia.training.objects;

import java.util.List;

public interface CarParkingInterface {
	
	
	public void park(Car c);
	public int countParkedCar() ;
	public int countRemainingParking();
	public void removePark(Car c);
	public List<Car> carList();

}
