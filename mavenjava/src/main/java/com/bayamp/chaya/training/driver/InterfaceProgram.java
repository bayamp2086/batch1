package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Person;
import com.bayamp.chaya.training.interfaces.EmployeeInterface;
import com.bayamp.chaya.training.interfaces.InternEmployeeInterface;
import com.bayamp.chaya.training.interfaces.StudentInterface;

public class InterfaceProgram {

	public static void main(String[] args) {

		String firstName = new String("Chaya");
		String lastName = new String("Basavarajaih");
		String unitNum = new String("2086");
		String streeName = new String("Walsh Avenue");
		String cityName = new String("Santa Clara");
		String state = new String("California");
		String pincode = new String("95054");

		Address2 address1 = new Address2(unitNum, streeName, cityName, state, pincode);

		StudentInterface s1 = new StudentInterface(firstName, lastName, address1);
		s1.setGpa(4.0);
		System.out.println("Student Details:\n" + s1 + "\n" + "ID: " + s1.generateID() + "\n" + "GPA: " + s1.getGpa());
		System.out.println(s1.getCount());
		String firstName1 = new String("Chayab");
		String lastName1 = new String("Basavarajaih");
		String unitNum1 = new String("2086");
		String streeName1 = new String("Walsh Avenue");
		String cityName1 = new String("Santa Clara");
		String state1 = new String("California");
		String pincode1 = new String("95054");

		Address2 addres1 = new Address2(unitNum1, streeName1, cityName1, state1, pincode1);
		InternEmployeeInterface intern = new InternEmployeeInterface(firstName1, lastName1, addres1);
		System.out.println("Intern Details:\n" + intern + "\n" + "ID: " + intern.generateID());
		System.out.println(intern.getCount());
		String firstName2 = new String("Shashi");
		String lastName2 = new String("Manjunath");
		String unitNum2 = new String("112");
		String streeName2 = new String("Carlyle Ct");
		String cityName2 = new String("Santa Clara");
		String state2 = new String("California");
		String pincode2 = new String("95054");

		Address2 address2 = new Address2(unitNum2, streeName2, cityName2, state2, pincode2);
		EmployeeInterface employee1 = new EmployeeInterface(firstName2, lastName2, address2);
		System.out.println("Employee Details:\n" + employee1 + "\n" + "Total Employee: " + employee1.getCount());

	}

}
