package com.bayamp.chaya.training.constructorandinheritence;
//public abstract class Person { 
public  class Person {
	protected String fName;
	protected String lName;
	protected Address2 address;
	protected static int count;

	public Person(String fname1, String lname1, Address2 add) {
		this.fName = fname1;
		this.lName = lname1;
		this.address = add;
		count++;
	}
	public String getFirstname(){
		return this.fName;
	}
	@Override
	public String toString(){
		 	return (fName + " " + lName + "\n" + address);

		
	}
	
	public boolean myEquals(Person p){
		System.out.println("Person");
		return true;
			
	}
	public boolean myEquals(Object p){
		System.out.println("Object");
		return true;


//	 public static int getCount() {
//	
//	 return count;
//		 }
	// public static String foo(){
	// return null;
	//
	// }work on this by calling the instance of student object with parent class
}
	public boolean myEquals(Student2 p){
	System.out.println("Student");
	return true;

}
}
