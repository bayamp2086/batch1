package com.bayamp.archana.training.inheritance;

public class Student extends Person {

	
	protected String id;
	protected String gpa;
	private static int studCount=0;
	
	public Student(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		super(fName, lName, gender, address, ssn);
		studCount = studCount + 1;
		// TODO Auto-generated constructor stub
	}

	public void studentDetails(String ID, String gpa) {
		this.id = ID;
		this.gpa = gpa;
	}

	public String toString() {
		
		return super.toString()+ "\n"+"ID:"+ this.id + "\n" + "GPA:"+ this.gpa;
		
	}
	public static int studentCount() {
		return studCount;
	}
}

