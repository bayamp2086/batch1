package com.bayamp.archana.training.inheritance;

public class PersonDetails {
	public static void main(String[] args) {
		System.out.println("The students details are:");
		AddressForPerson ad = new AddressForPerson("233", "escalon ave", "sunnyvale", "ca", "84095");
		ad.toString();
		String fName = new String("Archu");
		String nName = new String("Maran");
		String gender = new String("Female");
		String ssn = new String("0987");
		Student stud = new Student(fName, nName, gender, ad, ssn);
		stud.studentDetails("001", "3");
		System.out.println(stud.toString());
	    System.out.println("The count of Student:"+ Student.studentCount());
	    
	    System.out.println("The Employee details are:");
		AddressForPerson ad1 = new AddressForPerson("677", "hollenbeck ave", "santaclara", "ca", "89076");
		Employee emp = new Employee("Mohan", "karthi", "Male", ad1, "0087");
		emp.employeeDetails(002, "100k");
		System.out.println(emp.toString());
		System.out.println("The count of Employee:" +Employee.empCount());
		
		if(stud instanceof Student) System.out.println(true);
	    if(stud instanceof Person) System.out.println(true);
	    //  if(stud instanceof Employee) System.out.println(true);
				
	    AddressForPerson ad2 = new AddressForPerson("100", "Scott ave", "sanjose", "ca", "89076");
		ad2.toString();
		Person p1 = new Employee("Priya", "Hari", "Female", ad2, "6456");
		emp.employeeDetails(003, "280K");
		System.out.println(emp.toString());
		System.out.println("The count of Employee:" +Employee.empCount());
		System.out.println("The count of Person:"+ Person.getCount()); 
		
		//static methods dont over load
		Person p = new Person(ssn, ssn, ssn, ad2, ssn);
		p.foo();
		Employee e2 = new Employee(ssn, ssn, ssn, ad2, ssn);
		e2.foo();
		Person pe = new Employee(ssn, ssn, ssn, ad2, ssn);
		pe.foo();
		
		
	}
}
