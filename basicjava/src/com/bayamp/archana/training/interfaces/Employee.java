package com.bayamp.archana.training.interfaces;

import java.util.Random;

public class Employee extends Person implements IPerson ,AnotherInterface {

	protected Employee(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		super(fName, lName, gender, address, ssn);
		// TODO Auto-generated constructor stub
		//count++;
	}

	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return count;
		
		
	}

	@Override
	public String salary() {
		// TODO Auto-generated method stub
		String salary = "200K";
		return salary;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random()* 50);
		return random;
	}

	

}
