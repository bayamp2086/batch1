package com.bayamp.archana.training.objects.programs;

import com.bayamp.archana.training.objects.Address;
import com.bayamp.archana.training.objects.Stud;

public class StudentProgram {
	
	public static void main(String[] args) {
		
		System.out.println("This is normal constructor being called:");
		Stud stud1 = new Stud();
		
		
		
	// Parameterized Constructor:
		System.out.println("This is Parameterized constructor being called:");
		String firstName = new String("Archana");
		String lastName = new String("Maran");
		Address address1 = new Address("955", "Escalon ave", "sunnyvale", "california", "85091");
		address1.toString();
		Stud stud2 = new Stud(firstName, lastName, 4.5,3,address1);
		stud2.exactFirstName();
		//System.out.println(stud2);
		
		
	//	Student stud3 = new Student();
		
	}

}
