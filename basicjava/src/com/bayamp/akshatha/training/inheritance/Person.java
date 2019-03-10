package com.bayamp.akshatha.training.inheritance;

public abstract class Person {
	
	protected String fName;
	protected String lName;
	protected Address address;
	protected int gender;
	protected static int count;

	protected Person() {
		// TODO Auto-generated constructor stub
		
		
	}

	public Person(String fName2, String lName2, Address a1) {
		// TODO Auto-generated constructor stub
		System.out.println("Person constructor");
		this.fName=fName2;
		this.lName=lName2;
		this.address=a1;
		count++;
		
	}
	@Override
	public String toString() {
		return "Person [Name=" + fName + ", Last Name=" + lName + ", address=" + address + ", gender=" + gender + "]";
	}

//	public int getGenderValue() { return this.gender; }
	
	public static int getCount() {
		return count;
	}
	
	public boolean equals(Object param1) {
		
		if (!(param1 instanceof Student)){
			return false;
		}
		
		Student temp=(Student)param1;
		if (this== param1) {
			return true;
		}
		
		if(this.fName==temp.fName && this.lName == temp.lName) {
			return true;
		}
		
		return false;
	}
	
	

}
