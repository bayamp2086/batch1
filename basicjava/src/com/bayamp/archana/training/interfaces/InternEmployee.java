package com.bayamp.archana.training.interfaces;

public class InternEmployee extends Person implements IPerson {

	protected InternEmployee(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		super(fName, lName, gender, address, ssn);
		// TODO Auto-generated constructor stub
		//count++;
	}

	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return count;
	}


}
