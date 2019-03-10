package com.bayamp.akshatha.training.Utils;

import java.util.Arrays;

import org.testng.Assert;
//import static org.testng.Assert.*;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathLibTests {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void arrayAdditionTest() {
		int[] myNumbers= {5,4,3,2,5};
		ArrayUtils.removeDuplicates(myNumbers);
		
	//	MathUtil.addNumbers
		
		int sum=AdditionUtils.addnumbers(myNumbers);
		
	}
		@BeforeClass
		public void setUp(){
			
		}
		
		@AfterClass
		public void cleanup() {
			
		}
		
		@BeforeMethod
		public void method() {
			
		}
		
		@Test
		public void arrayAdditionTestPositiveValue() {
			
			int[] inputData= {5,4,3,2,5};
			int expected=19;
			int actualValue=AdditionUtils.addnumbers(inputData);
			
			//validations
			Assert.assertEquals(actualValue, expected);
			Reporter.log("Input Data: "+Arrays.toString(inputData));
		}
		
		public void arrayAdditionTestNegativeValue() {
			
			int[] inputData= {-5,-4,-3,-2,-5};
			int expected=-19;
			int actualValue=AdditionUtils.addnumbers(inputData);
			
			//validations
			Assert.assertEquals(actualValue, expected);
			Reporter.log("Input Data: "+Arrays.toString(inputData));
		}
		
		public void arrayAdditionTestEmptyArray() {
			
		}
	

}
