package com.bayamp.archana.training.inheritance;

public class Employee extends Person {

	Employee(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		super(fName, lName, gender, address, ssn);
		empCount++;
		
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String salary;
	private static int empCount;

	public void employeeDetails(int id, String salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public static int empCount() {
		return empCount;
	}
	
	public String toString(){
		return super.toString() +"\n"+ "Id: " + this.id +"\n"+"Salary:" + this.salary;
		}
	
	
	public static void foo() {
    	System.out.println("this is Child foo");
    }
	
	
}
