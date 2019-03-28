package com.bayamp.akshatha.training.programs;

import com.bayamp.akshatha.training.interfaces.Student;

public class ExternalUtil {

	public static double getStudentGpa(Student s) {
		Student temp=(Student)s;
		return temp.getGpa();
	}
}
