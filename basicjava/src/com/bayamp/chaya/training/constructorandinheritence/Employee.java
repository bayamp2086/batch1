package com.bayamp.chaya.training.constructorandinheritence;

public class Employee extends Person {
	private double salary;
	private static int count = 0;

	public Employee(String fname1, String lname1, Address2 add) {
		super(fname1, lname1, add);
		count++;
	}

	@Override
	public String toString() {
		return (fName + " " + lName + "\n" + address);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getCount() {

		return count;

	}

}
