package com.bayamp.akshatha.training.inheritance;

import com.bayamp.akshatha.training.programs.*;

public class StudentProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName = new String("Akshatha");
		String lName = new String("Mahale");

		Address a1 = new Address("500 W Evelyn Ave", "Sunnyvale", "94086", "CA");
		Address a2 = new Address("501 W Evelyn Ave", "Sunnyvale", "94086", "CA");
		Address a3 = new Address("502 W Evelyn Ave", "Sunnyvale", "94086", "CA");
		Address a4 = new Address("503 W Evelyn Ave", "Sunnyvale", "94086", "CA");

		Person e1 = new Employee(fName, lName, a1, 1000);
		Person e2 = new Employee(fName, lName, a2, 5000);
		Person e3 = new Employee(fName, lName, a3, 4300);
		
		
		Person s1 = new Student(fName, lName, a1, 3.3);
		Person s2 = new Student(fName, lName, a2, 3.9);

		if (s1 instanceof Student) {
			Student s3cast = (Student) s1;
			System.out.println(s3cast.getGpa());
		}
		
		Employee e1cast=(Employee)e1;
		System.out.println(e1cast.getSalary());

		System.out.println("No of Employess " + Employee.getCount());
		System.out.println("No of Students " + Student.getCount());
		System.out.println("No of Persons " + Person.getCount());

		// System.out.println(s.getGenderValue());
		System.out.println(s1.address);

		Person p1 = new Student(fName, lName, a1, 3);
		Person jamesBond = new Student("harish", "app", a2, 3.6);

		if (jamesBond instanceof Student) {
			Student castP = (Student) jamesBond;

		}
		Service webDriver = new UseLessClass();
		double gpa = webDriver.getGPA(jamesBond);
		System.out.println(webDriver.address.getAddress());

	}
}
