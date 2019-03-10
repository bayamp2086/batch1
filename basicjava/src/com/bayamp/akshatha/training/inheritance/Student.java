package com.bayamp.akshatha.training.inheritance;

public class Student extends Person {

	protected static int count;
	protected int gender;
	private double gpa;
	
	private Student() {
		
	}
	public int getGenderValue() { return this.gender; }
	 
	public static int getCount() {
		return count;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Student(String fName2, String lName2, Address a1, double gpa) {
	  super(fName2, lName2, a1);
	  this.gpa=gpa;
	  System.out.println("Student constructor"); 
	  count++;
	  }
	 
	  public String toString() {
		  return (super.toString()+" gpa= "+this.gpa);
	  }
		
}