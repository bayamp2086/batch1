package com.bayamp.chaya.training.constructorandinheritence;

public class Student2 extends Person {
	private double gpa;
	private static int count = 0;

	public Student2(String fname1, String lname1, Address2 add) {
		super(fname1, lname1, add);
		count++;
	}

	@Override
	public String toString() {
		return (fName + " " + lName + "\n" + address);
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
	/*public boolean myEquals(Student2 p){
		System.out.println("Student Overloaded");
		return true;
			
	}
	public boolean myEquals(Person p){
		System.out.println("Student");
		return true;
			
	}
	public boolean myEquals(Object p){
		System.out.println("Object Overloaded");
		return true;
			
	}
*/

}
