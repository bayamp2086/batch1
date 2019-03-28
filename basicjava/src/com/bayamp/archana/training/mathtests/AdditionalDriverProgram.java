package com.bayamp.archana.training.mathtests;

import com.bayamp.archana.training.utils.MathUtil;

public class AdditionalDriverProgram {
	

	public static void main(String[] args) {

		MathUtil.addTwoNumbers(10, 10);
		// Users.mohanakarthikeyan.bayamp-training.eclipse-workspace.basicjava.src.com.bayamp.utils.MathUtil.addTwoNumbers(10,10);

		MathUtil obj1 = new MathUtil();
		obj1.addTwoNumbers(2.1f, 2.3f);
		
		int[] num1 = {2,3};
		obj1.addition(num1);
		
		int total = MathUtil.addTwoNumbers(10, 10);
		int expectedTotal= 20;

		
		//https://www.tutorialspoint.com/java/java_basic_operators.htm  All java operators. 
//		TestCase1:
		if (total == expectedTotal) {
			System.err.println("Testcase has passed");
		}
			else {
				System.err.println("Testcase has failed");
			}
		
		int number =10;
		obj1.numbers(10);
		
	}



	
}
