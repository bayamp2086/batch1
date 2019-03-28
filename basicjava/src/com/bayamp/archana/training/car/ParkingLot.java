package com.bayamp.archana.training.car;

public class ParkingLot {

	Car[] carList = new Car[5];
	static int carCount= 0;
   
	public boolean park(Car car_obj) {
		
		if(isFull()== false) {
			
			carList[carCount] = car_obj;
			carCount = carCount +1;
			return true;
		}
		System.out.println("The parking lot has 5 slots");
		return false;
		
	}
	
	
	void getParkedCars() {
		for(int i =0; i < carCount; i++) {
			System.out.println(carList[i]);
		}
	}
	
	
	boolean isFull(){
		if(carCount < carList.length) return false;
		return true;
	}
	
	
	int[] nums = new int[5];
	
	void addNos(int n) {
		nums[0] = n;
		
		
	}
	

}
