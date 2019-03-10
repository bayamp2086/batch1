package com.bayamp.akshatha.training.interfaces;


public class Employee extends Person implements IPerson {
	
	protected static int count;
	protected int gender;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String fName, String lName, Address a1, double  sal) {
		// TODO Auto-generated constructor stub
		
		super(fName,lName,a1);
		this.salary=sal;
		count++;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	 * public static int getCount() { return count; }
	 */
}
