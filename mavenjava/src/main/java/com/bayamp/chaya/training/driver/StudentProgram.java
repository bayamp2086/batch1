package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Employee;
import com.bayamp.chaya.training.constructorandinheritence.Person;
import com.bayamp.chaya.training.constructorandinheritence.Student2;
import com.bayamp.chaya.training.interfaces.Vikings;

public class StudentProgram {

	public static void main(String[] args) {

		String firstName = new String("Chaya");
		String lastname = new String("Basavarajaiah");

		String unitNum = new String("8086");
		String streeName = new String("Walsh Avenue");
		String cityName = new String("Santa Clara");
		String state = new String("California");
		String pincode = new String("95054");

		Address2 address = new Address2(unitNum, streeName, cityName, state, pincode);
		Student2 s = new Student2(firstName, lastname, address);
		s.setGpa(4.2);
		String firstName5 = new String("LIPI");

		Person s3 = new Student2(firstName5, lastname, address);
		Student2 s3Cast = (Student2) s3;
		s3Cast.setGpa(3.8);
		Vikings gender1 = new Vikings();
		// gender1.getGender("female");

		System.out.println("STUDENT DETAILS:" + "\n" + s);
		System.out.println("GPA is: " + s.getGpa());
		System.out.println("STUDENT DETAILS:" + "\n" + s3Cast + "\n" + "Gender:" + gender1.getGender("female"));
		System.out.println("GPA is: " + s3Cast.getGpa());

		String firstName1 = new String("Shashi");
		String lastname1 = new String("Shekhar");
		String unitNum1 = new String("112");
		String streeName1 = new String("Carlyle");
		String cityName1 = new String("Santa Clara");
		String state1 = new String("California");
		String pincode1 = new String("95054");
		Address2 address2 = new Address2(unitNum1, streeName1, cityName1, state1, pincode1);
		Employee emp = new Employee(firstName1, lastname1, address2);
		emp.setSalary(100000);
		System.out.println("\n" + "EMPLOYEE DETAILS:" + "\n" + emp);
		System.out.println("Salary :" + emp.getSalary());
		System.out.println("Total no. of Students: " + Student2.getCount());
		System.out.println("Total no. of Employee's: " + Employee.getCount());
		// System.out.println("Total no. of Person's: " + Person.getCount());
		s.myEquals(s3Cast);
		System.out.println(s3.getFirstname());

	}

}
