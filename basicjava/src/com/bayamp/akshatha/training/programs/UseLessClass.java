package com.bayamp.akshatha.training.programs;

import com.bayamp.akshatha.training.inheritance.*;

public class UseLessClass implements Service{
	
	public double getGPA(Person p) {
		double gpa=0.0;
		if(p instanceof Student) {
			Student pCast=(Student)p;
			gpa=pCast.getGpa();
			
		}
		return gpa;
	}

	
}
