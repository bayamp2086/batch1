package com.bayamp.sonia.training.objects;

public class Employee extends Person {

	private double salary;
	private static int count;
	public static int Personcount;

	public Employee(String fname, String lname, Address address) {
		super(fname, lname, address);
		Employee.count = Employee.count + 1;
		Personcount=super.getCount();
	}

	public double getSalary() {
		return salary;
	}
	
	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		Employee.count = count;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee Salary :" + salary + "\nEmployee Count :" + count;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
