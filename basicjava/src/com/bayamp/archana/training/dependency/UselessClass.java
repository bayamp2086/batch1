package com.bayamp.archana.training.dependency;

import com.bayamp.archana.training.inheritance.Person;
import com.bayamp.archana.training.inheritance.Student;

public class UselessClass implements HorribleName{

	@Override
	public double getGpa(Person p) {
		// TODO Auto-generated method stub
		
		if (p instanceof Student) {
			Student obj = (Student)p;
		}
		return 0;
	}

}
