package com.bayamp.sonia.training.objects.programs;

import com.bayamp.sonia.training.objects.Address;
import com.bayamp.sonia.training.objects.Employee;
import com.bayamp.sonia.training.objects.Person;
import com.bayamp.sonia.training.objects.Student;

public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = new String("Sonia");
		String lastName = new String("Gupta");
		Double gpa = new Double(6.44);
		Double salary = new Double(6000);

		Address studentAddress = new Address();

		String streetNo = new String("2086");
		String stressAdd = new String("Walsh Aveneue");
		String studentCity = new String("SantaClara");
		String studentState = new String("CA");
		String studentCountry = new String("USA");
		String zipCode = new String("208677");

		studentAddress.setStreetNo(streetNo);
		studentAddress.setStressAdd(stressAdd);
		studentAddress.setStudentCity(studentCity);
		studentAddress.setStudentState(studentState);
		studentAddress.setStudentCountry(studentCountry);
		studentAddress.setZipCode(zipCode);

		String firstName1 = new String("Shipra");
		String lastName1 = new String("Jain");
		Double salary1 = new Double(5000);
		Double gpa1 = new Double(2.44);
		Address studentAddress1 = new Address();

		String streetNo1 = new String("2086");
		String stressAdd1 = new String("1st Stree");
		String studentCity1 = new String("Milpitas");
		String studentState1 = new String("CA");
		String studentCountry1 = new String("USA");
		String zipCode1 = new String("95136");

		studentAddress1.setStreetNo(streetNo1);
		studentAddress1.setStressAdd(stressAdd1);
		studentAddress1.setStudentCity(studentCity1);
		studentAddress1.setStudentState(studentState1);
		studentAddress1.setStudentCountry(studentCountry1);
		studentAddress1.setZipCode(zipCode1);

		Person p1 = new Student(firstName, lastName, studentAddress);
		System.out.println("---" +p1.getfName());
		//System.out.println(p1.get);
		
		Student ps1 = new Student(firstName, lastName, studentAddress);
		System.out.println(ps1.getfName());
		System.out.println(ps1.getGpa());
		
		System.out.println("--"+ p1.getfName());

		Student s1 = (Student) p1;
		s1.setGpa(gpa);

		Person p2 = new Student(firstName1, lastName1, studentAddress1);

		Student s2 = (Student) p2;
		s2.setGpa(gpa1);

		Person p3 = new Employee(firstName, lastName, studentAddress);
		Employee e3 = (Employee) p3;
		e3.setSalary(salary);
		Person p4 = new Employee(firstName1, lastName1, studentAddress1);
		Employee e4 = (Employee) p4;
		e4.setSalary(salary1);
		
		//System.out.println(s1);

		System.out.println("Total Students Count :" + s1.getCount());

		System.out.println("Total Employees Count :" + e3.getCount());
		
		System.out.println("Total Person Count :" + p1.getCount());
		
		System.out.println("Total Person Count through Class variables :" + Employee.Personcount);
		
		if(p1.equals(p2)) {
			
		}

	}

}
