package com.bayamp.akshatha.training.interfaces;

public abstract class Person {
	
	private String fName;
	protected String lName;
	protected Address address;
	private String add;
	protected int gender;
	protected static int count;

	protected Person() {
		// TODO Auto-generated constructor stub
		
		
	}

	public Person(String fName2, String lName2, Address a1) {
		// TODO Auto-generated constructor stub
		//System.out.println("Person constructor");
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
	/*
	 * public static int getCount() { return count; }
	 */
	/*
	 * public boolean equals(Object param1) {
	 * 
	 * if (!(param1 instanceof Student)){ return false; }
	 * 
	 * Student temp=(Student)param1; if (this== param1) { return true; }
	 * 
	 * if(this.fName==temp.fName && this.lName == temp.lName) { return true; }
	 * 
	 * return false; }
	 */
	
	
	  public boolean equals(Person p) { System.out.println("Person class equals-person arg");
	  return false;
	  
	  }
	 
	 
	
	public boolean equals(Object p) {
		System.out.println("Person class equals-object arg");
		return false;
		  
	  }
	
	public boolean equals(Student p) { System.out.println("Person class equals-student arg");
	  return false;
	  
	  }
	public String getFirstName() {
		return this.fName;
	}
	
	public void  setAddress(String a) {
		this.add=a;
		
	}

}
