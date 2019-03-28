package com.bayamp.akshatha.training.interfaces;

public class InterfaceProgram {
	
	public static void main(String[] args) {
	Address a1 = new Address("500 W Evelyn Ave", "Sunnyvale", "94086", "CA");
	Address a2 = new Address("501 W Evelyn Ave", "Sunnyvale", "94086", "CA");
	
	Person p1=new Student("harish","app",a1,9);
	Person p2=new Student("harish","app",a2,9);
	
	p1.equals(p2);
	
	System.out.println(p1.getFirstName());
	p1.setAddress("2022");
	
	
	
	
}
}
