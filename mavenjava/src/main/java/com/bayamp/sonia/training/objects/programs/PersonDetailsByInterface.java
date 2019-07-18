package com.bayamp.sonia.training.objects.programs;

import com.bayamp.sonia.training.objects.Address;
import com.bayamp.sonia.training.objects.CTEmployee;
import com.bayamp.sonia.training.objects.IPerson;
import com.bayamp.sonia.training.objects.IPersonID;
import com.bayamp.sonia.training.objects.Person;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class PersonDetailsByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = new String("Sonia");
		String lastName = new String("Gupta");
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
		
		IPerson p=new CTEmployee(firstName,lastName,studentAddress);
		
		//IPerson p1=new CTEmployee(firstName,lastName,studentAddress);
		
		IPersonID p2=new CTEmployee(firstName,lastName,studentAddress);
		
		
		SystemPrintClass.print("Person Count :"+p.getPersonCount());
		
		SystemPrintClass.print("Employee StudentID :"+p2.calculateStudID());
		
		Person po= new CTEmployee(firstName,lastName,studentAddress);
		
		CTEmployee cte =null;
		if(po instanceof CTEmployee) {
			cte=(CTEmployee)po;
			cte.setStudentID(p2.calculateStudID());
			cte.setSalary(6000);
			
			
		}
		
		SystemPrintClass.print("CTEmployee :"+cte);
		
		
		

	}

}
