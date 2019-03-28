package com.bayamp.archana.training.interfaces;

public class InterfacePersonProgram {

	public static void main(String[] args) {
	AddressForPerson ad1 = new AddressForPerson(955, "escalon ave", "sunnyvale", "ca", 95087);
	Employee emp = new Employee("archana", "maran", "female", ad1, "8907");
	System.out.println(emp.toString());
	System.out.println("Count of the Employee: " +emp.counter());
	System.out.println("Salary of the Employee: " +emp.salary());
	System.out.println("Id of the Employee: " +emp.id());
		
    InternEmployee intemp = new InternEmployee("Hari", "Shiv", "male", ad1, "0051");
    System.out.println("Count of the InternEmployee: " +intemp.counter());
    
    Student s = new Student("aisha", "begam", "female", ad1, "3456");
    System.out.println(s.toString());
	System.out.println("Count of the Student: " +s.counter());
	
	Person p = new Student("Mona", "Shiva", "female", ad1, "0976");
	System.out.println(p.toString());
	System.out.println("Count of the Person: " +p.counter());
	System.out.println("Id of the Student: " +p.id());
}
}