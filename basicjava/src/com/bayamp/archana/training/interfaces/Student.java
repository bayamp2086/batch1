package com.bayamp.archana.training.interfaces;

public class Student extends Person implements IPerson, AnotherInterface {

	public Student(String fName, String lName, String gender, AddressForPerson address, String ssn) {
		super(fName, lName, gender, address, ssn);
		//studCount = studCount + 1;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String salary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random()*80);
		return random;
	}
	
	
	public boolean myEquals(Object o) {
		System.out.println("Student");
		return true;	
	}
	

	public boolean myEquals(Person o) {
		System.out.println("Person2");
		return true;	
	}
	
	public boolean myEquals(Student o) {
		System.out.println("Student");
		return true;	
	}


}



