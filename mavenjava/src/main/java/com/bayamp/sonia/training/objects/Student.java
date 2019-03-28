package com.bayamp.sonia.training.objects;

import com.bayamp.sonia.training.objects.Address;

public class Student extends Person {

	private double gpa;
	private static int count;

	public Student(String fname, String lname, Address address) {
		super(fname, lname, address);
		Student.count = Student.count + 1;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		Student.count = count;
	}

	
	public String toString() { return super.toString() + "\nGPA  :" + this.gpa +
	  "\nStudent Count :" + Student.count;
	  
	  }
	
	
	 
	  
	
	  public boolean equals(Person P) {
	  
	  System.out.println("In Person of Student "); return true; }
	 
	  
	  public boolean equals(Student P) {
		  
		  System.out.println("In Student of Student "); 
		  return true; 
		  }
	 
	  
	  
	 

}
