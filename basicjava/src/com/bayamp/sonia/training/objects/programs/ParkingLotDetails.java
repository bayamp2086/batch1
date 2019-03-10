package com.bayamp.sonia.training.objects.programs;

import com.bayamp.sonia.training.objects.Car;
import com.bayamp.sonia.training.objects.CarParkingInterface;
import com.bayamp.sonia.training.objects.ParkingLot;

public class ParkingLotDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car("Sonia","Honda");
		Car c1=new Car("Harish","Tesla");
		Car c2=new Car("Minu","Toyota");
		Car c3=new Car("Adi","Hona");
		
		CarParkingInterface p=new ParkingLot();
		p.park(c);
		p.park(c1);
		p.park(c2);
		p.park(c3);
		
		System.out.println("Total Parked Car :"+p.countParkedCar());
		System.out.println("Total Remaining Car Parking :" + p.countRemainingParking());
		
		
		p.removePark(c);
		
		System.out.println("********After Removing one Car******");
		
		System.out.println("Total Parked Car :"+p.countParkedCar());
		System.out.println("Total Remaining Car Parking :" + p.countRemainingParking());
		
		System.out.println("Total Parked Car :"+p.carList());
		
	}

}
