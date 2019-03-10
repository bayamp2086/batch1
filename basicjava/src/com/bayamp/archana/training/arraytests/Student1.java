package com.bayamp.archana.training.arraytests;

public class Student1 {
	protected String firstName;
	protected String lastName;
	protected String rollno;
	protected String id;

	Student1 (String fName,String lname,String rollno,String id){
		this.firstName = fName;
		this.lastName = lname;
		this.rollno = rollno;
		this.id =id;
		System.out.println("Firstname is "+fName+","+ "LastName is "+ lname+","+"rollno is "+ rollno+","+"id is "+ id);
		
	}
	
}
