package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.constructorandinheritence.Address;
import com.bayamp.chaya.training.constructorandinheritence.Student;

public class StudentDetailProgram {

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println("PRINTING THE STUDENT NAME USING CONSTRUCTOR WITHOUT PARAMETER ");
		System.out.println("Student Firstname:: " + s1.getFirstName());
		System.out.println("	Lastname:: " + s1.getLastName() + "\n");

		System.out.println("PRINTING THE STUDENT DETAILS USING CONSTRUCTOR WITH PARAMETER ");
		Student s2 = new Student("Shashi", "Manjunatha", 234, 4.5);

		Student s3 = new Student("Chaya", "Basu");
		System.out.println(
				"\nPRINTING THE STUDENT NAME USING CONSTRUCTOR WITH PARAMETER AND OVERIDING THE TOSTRING() METHOD");
		System.out.println(s3);

		Student s4 = new Student();
		Address address = new Address();
		String firstName = new String("Karthik");
		String lastName = new String("Chandra");
		String unitNum = new String("112");
		String streeName = new String("Carlyle Court");
		String cityName = new String("Santa Clara");
		String stateName = new String("California");
		String pinCode = new String("95054");
		s4.setFirstName(firstName);
		s4.setlastName(lastName);
		address.setUnitNumber(unitNum);
		address.setCity(cityName);
		address.setPinCode(pinCode);
		address.setState(stateName);
		address.setStreetNumber(streeName);
		System.out.println("\nPRINTING THE STUDENT DETAILS WITH ADDRESS");
		System.out.println("Student Firstname:: " + s4.getFirstName());
		System.out.println("	Lastname:: " + s4.getLastName());

		System.out.println("Adress: " + address.getUnitNumber() + " " + address.getStreetNumber() + " " + "\n	"
				+ address.getCity() + "\n	" + address.getState() + "\n	" + address.getPinCode());

	}

}
