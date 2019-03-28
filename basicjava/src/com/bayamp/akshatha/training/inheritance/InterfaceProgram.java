package com.bayamp.akshatha.training.inheritance;

import com.bayamp.akshatha.training.interfaces.Address;

public class InterfaceProgram {

	public static void main(String[] args) {
		String s1=new String("aks");
		
		//checks the heap if the object/value is already present.If so it refers to same one.
		String s2="harish";
		String s3=new String("harish");
		String s4="harish";
		
		if(s2==s4) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		Address a1 = new Address("500 W Evelyn Ave", "Sunnyvale", "94086", "CA");
		Address a2 = new Address("501 W Evelyn Ave", "Sunnyvale", "94086", "CA");
		
		/*Person p1=new Student("harish","app",a1,9);
		Person p2=new Student("harish","app",a,9);*/
		
		
	//IPerson ip=new Student()
}
}
