package com.bayamp.archana.training.interfaces;

public class Person implements IPerson, AnotherInterface {

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
		return "FirstName:" + this.firstName + "\n" + "LastName:" + this.lastName + "\n" + "Gender:" + this.gender
				+ "\n" + "Address:" + this.address + "\n" + "SSN:" + this.ssn;
	}
	
	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public String salary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}

	// the static method will not b overloading
	public static void foo() {
		System.out.println("this is parent foo");
	}

	 /*boolean equals(Person param1) {
		if (this == param1) {
			return true;
		}
		if (this.firstName == param1.firstName && this.lastName == param1.lastName) {
			return true;
		}
		return false; }*/
	
	// after casting Person in object class
	
	
	/*public boolean equals(Object param1) {
		if(!(param1 instanceof Student) ) {
			return false;
		}
		Student temp = (Student)param1;
		if (this == param1) {
			return true;
		}
		if (this.firstName == temp.firstName && this.lastName == temp.lastName) {
			return true;
		}
		return false;
		 }*/
	
	public boolean myEquals (Person o) {
		System.out.println("PersonParent");
		return true;
	}
	
	public boolean myEquals(Student o) {
		System.out.println("StudentParent");
		return true;	
	}
	
	public boolean equals(Object param1) {
	if(!(param1 instanceof Student) ) {
		return false;
	}
	Student temp = (Student)param1;
	if (this.firstName == temp.firstName && this.lastName == temp.lastName) {
		return true;
	}
	return false;
	}

	

	

}
