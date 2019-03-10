package com.bayamp.akshatha.training.interfaces;



public class Student extends Person implements IPerson {

//	protected static int count;
	protected int gender;
	private double gpa;
	private int count;
	public static String firstName;
	
	
	public int getGender() {
		return gender;
	}
	public  String getFirstName() {
		return firstName;
	}
	public Student() {
		
	}
	public int getGenderValue() { return this.gender; }
	 
	/*
	 * public static int getCount() { return count; }
	 */
	
	public int getCount() {
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
	 // System.out.println("Student constructor"); 
	 // count++;
	  }
	 
	  public String toString() {
		  return (super.toString()+" gpa= "+this.gpa);
	  }
	/*
	 * @Override public String getFirstName() { // TODO Auto-generated method stub
	 * return null; }
	 */
	  
	
	
	  public boolean equals(Person p) { System.out.println("Student class equals-person arg");
	  return false;
	  
	  }
	 

	
	  public boolean equals(Student p) { 
	  System.out.println("Student class equals-student arg");
	  return false;
	  
	  }
	 
 public boolean equals(Object p) {
	return false;
	  
 }
		
}