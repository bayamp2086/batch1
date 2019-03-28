package com.bayamp.archana.training.testNg;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AdditionalTest {
	
	// @BeforeClass @AfterClass
	// @BeforeTest @AfterTest
	// @BeforeMethod @AfterMethod
	
	
	@Test
	public void arrayAdditionPositiveValues() {

		int[] inputData = {5,4,3,2,5};
		int expected = 19;
		int actual = AdditionUtils.addNumbers(inputData);
		//Validations
		Assert.assertEquals(actual, expected);

		//Reporting
		Reporter.log("The input Data:"+ Arrays.toString(inputData));
		Reporter.log( "Expected Output: "+expected +"Actual Output: "+actual);

        // Hard assertion
	}
	
	@Test
	public void arrayAdditionPositiveAndNegativeValues() {

		int[] inputData = {-5,4,3,2,5};
		int expected = 9;
		int actual = AdditionUtils.addNumbers(inputData);
		//Validations
		Assert.assertEquals(actual, expected);

		//Reporting
		Reporter.log("The input Data:"+ Arrays.toString(inputData));
		Reporter.log( "Expected Output: "+expected +"Actual Output: "+actual);


	}
	
	@Test
	public void arrayAdditionNegativeValues() {

		int[] inputData = {};
		int expected = 0;
		int actual = AdditionUtils.addNumbers(inputData);
		//Validations
		Assert.assertEquals(actual, expected);

		//Reporting
		Reporter.log("The input Data:"+ Arrays.toString(inputData));
		Reporter.log( "Expected Output: "+expected +"Actual Output: "+actual);


	}
}
