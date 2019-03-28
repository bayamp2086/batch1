package com.bayamp.chaya.training.constructorandinheritence;

public class Student {

	// Global variables

	private String firstName = "";
	private String lastName;
	private int id;
	private double gpa;
	private Address address;

	// constructor without parameter

	public Student() {

		this.firstName = "Chaya";
		this.lastName = "Basavarajaih";

	}
	// setter method for firstname(setters and getters are used since
	// constructor is not intialised with the parameter )

	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	// getter method for lastname

	public String getFirstName() {
		return this.firstName;

	}

	// setter method for lastname

	public void setlastName(String lName) {
		this.lastName = lName;

	}
	// getter method for lastname

	public String getLastName() {
		return this.lastName;
	}
	// constructor with parameters

	public Student(String fName, String lName, int id, double gpa) {
		this.firstName = fName;
		this.lastName = lName;
		this.id = id;
		this.gpa = gpa;

		System.out.println("Student first name is: " + fName);
		System.out.println("	last name is: " + lName);
		System.out.println("	id is: " + id + " and scored " + gpa);

	}

	// constructor with parameters
	public Student(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;

	}

	@Override

	public String toString() {
		return ("First Name is :: " + firstName + "\n" + "LastName is :: " + lastName);
	}

}
