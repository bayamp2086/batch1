package com.bayamp.archana.training.inheritance;

public  class Person  {

	protected String firstName;
	protected String lastName;
	protected String gender;
	protected AddressForPerson address;
	protected String ssn;
	protected static int count = 0;
	
	protected Person(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		this.firstName = fName;
		this.lastName = lName;
		this.gender = gender;
		this.address = address;
		this.ssn = ssn;
		count++;

	}
	
	public String toString() {
		return "FirstName:" + this.firstName + "\n" + "LastName:" + this.lastName + "\n" + "Gender:" + this.gender + "\n"
				+ "Address:" + this.address + "\n" + "SSN:" + this.ssn;
	}
    public static int getCount() {
		return count;
	}
	// the static method will not b overloading
    public static void foo() {
    	System.out.println("this is parent foo");
    }
}
