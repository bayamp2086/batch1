package com.bayamp.sonia.training.objects.programs;

import com.bayamp.sonia.training.objects.Car;
import com.bayamp.sonia.training.objects.CarParkingInterface;
import com.bayamp.sonia.training.objects.ParkingLot;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class ParkingLotDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car("Sonia","Honda");
		Car c1=new Car("Harish","Tesla");
		Car c2=new Car("Minu","Toyota");
		Car c3=new Car("Adi","Honda");
		
		CarParkingInterface p=new ParkingLot();
		p.park(c);
		p.park(c1);
		p.park(c2);
		p.park(c3);
		
		SystemPrintClass.print("Total Parking Slots:"+p.totalParking());
		
		SystemPrintClass.print("Parked Cars Details:"+p.carList());
		SystemPrintClass.print("Total Parked Car :"+p.countParkedCar());
		SystemPrintClass.print("Remaining Car Parking Slots:" + p.countRemainingParking());
		
		
		p.removePark(c3);
		
		SystemPrintClass.print("Removed Car Details :"+c3);
		
		SystemPrintClass.print("********After Removing one Car******");
		
		SystemPrintClass.print("Parked Cars Details:"+p.carList());
		SystemPrintClass.print("Total Parked Car :"+p.countParkedCar());
		SystemPrintClass.print("Remaining Car Parking :" + p.countRemainingParking());
		
		
		
	}

}
