package com.bayamp.sonia.training.math.tests;

import com.bayamp.sonia.training.utils.MathUtil;

public class AddNumberTests {
	
	
	public static void TestCase1() {
		int inputNum=10;
		int inputNum2=20;
		
		int results=30;
		
		if(MathUtil.addNumbers(inputNum, inputNum2)==results) {
			
			System.out.println("Test Case Pass");
		}
		else if(MathUtil.addNumbers(inputNum, inputNum2)!=results) {
			
			System.out.println("Test Case Fail");
		}
		
		
	}
	
	public static void main(String [] args) {
		
		TestCase1();
		
	}

}
