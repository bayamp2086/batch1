package com.bayamp.akshatha.training.interview.problems;

import java.util.ArrayList;

public class ParkingLot {

	Car c;
	int capacity;
	ArrayList<Car> clist;
	String name;
	int remainingSpotsCount;

	public ParkingLot(int capacity, String s) {
		this.capacity = capacity;
		clist = new ArrayList<Car>(capacity);
		this.name = s;
	}

	

	public void park(Car c) {
		if (clist.contains(c)) {
			System.out.println("\n" + c.toString() + " already in the Parking lot\n");
		} else {
			if (clist.size() <= this.capacity) {
				clist.add(c);
				remainingSpotsCount = this.capacity - clist.size();
				
			} else {
				System.out.println("No parking space available\n");
			}
		}
	}

	public String getName() {
		return name;
	}

	public int getRemainingSpotsCount() {
		System.out.println(this.name + " Parking lot has " + remainingSpotsCount + " spots remaining\n");
		return remainingSpotsCount;
	}

	public ArrayList<Car> getClist() {
		return clist;
	}

	public void removeCar(Car c) {
		if (clist.contains(c)) {
			clist.remove(c);
			remainingSpotsCount = this.capacity - clist.size();

		} else {
			System.out.println("Cannot remove :" + c.toString() + " not in the Parking lot\n");
		}
	}

}
