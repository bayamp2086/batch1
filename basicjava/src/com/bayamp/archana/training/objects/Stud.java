package com.bayamp.archana.training.objects;

public class Stud {
	
	private String firstName;
	private String lastName;
	private double gpa;
	private int rollNo;
	private Address address;
	
	public Stud(){
		firstName = "Arya";
		lastName ="Mohan";
		gpa=9.0;
		rollNo=(int) (Math. random() * 3) + 1;
		System.out.println(firstName + ", "+ lastName + ", "  + ",  "+ gpa+","+rollNo);
		
		
		
	}
	
	public Stud(String fName,String lName,double percent,int rollNo,Address address){
		this.firstName= fName;
		this.lastName =lName;
		this.gpa =percent;
		this.rollNo = rollNo;
		this.address = address;
			
		System.out.println(fName + ", "+ lName + ", "+ percent+","+rollNo+","+address);
	}

	public void exactFirstName() {
		String firstName = new String("Harish");
		int strlen = firstName.length();
		
		char[] allChars = firstName.toCharArray();
		int len = allChars.length;
		int len1 = new String("Harish").toCharArray().length;
		System.out.println(len1 +" vs "+len);
		
	}

}
