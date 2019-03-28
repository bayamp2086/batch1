package com.bayamp.archana.training.interfaces;

public class InterfaceProgram extends Person {

	InterfaceProgram(String fName, String lName, String gender, String address, String ssn) {
		super(fName, lName, gender, address, ssn);
		// TODO Auto-generated constructor stub
	}

	static String name1 = "archana";
	static String name2 = new String("archana");
	static String name3 = "archana";
	static String name4 = new String("archana");
	
	public static void main(String[] args) {

	if (name1 == name2) {
		System.out.println("Same names with same address");
	} else {
		System.out.println("Not same names different address have saved in the heap");
	}
//same
	if (name1 == name3) {
		System.out.println("Same names with same address");
	} else {
		System.out.println("Not same names different address have saved in the heap");
	}

	if (name2 == name4) {
		System.out.println("Same names with same address");
	} else {
		System.out.println("Not same names different address have saved in the heap");
	}
// equals method 	(can return true or false based on its overridden implementation)
	if(name1.equals(name2))
	{
		System.out.println("They are same by equals method");
	}else
	{
		System.out.println("They are not same");
	}
// == method	(returns true only if both references points to same object )
	if(name1==name2)
	{
		System.out.println("They are same by equals method");
	}else
	{
		System.out.println("They are not same (==)");
	}
	
//	==============
			
			//Object o = new Object();
			//Person p = (Person)o;
			
			Person p1 = new Student("Archana", "Maran", "female", "address", "0987");
			Person p2 = new Student("Archana", "Maran", "female", "address", "0987");
			
			if (p1.equals(p2)) {
				System.out.println("They are same");
			}else
			{
				System.out.println("They are not same");
			}
			
			
			p1.myEquals((Student)p2);

}
}
