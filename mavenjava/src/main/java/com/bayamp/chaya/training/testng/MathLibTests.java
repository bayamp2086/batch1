package com.bayamp.chaya.training.testng;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MathLibTests {
	@Test
	public void arrayAdditionTestPositive() {
		int[] inputData = { 5, 4, 3, 2, 5 };
		int expected = 19;
		int actualVaue = AddUtils.addnumbers(inputData);

		// Validations
		Assert.assertEquals(actualVaue, expected);

		// Reporting
		Reporter.log("Input DAta: " + Arrays.toString(inputData));
		Reporter.log("Expected Output:" + expected + "Actual ouput got: " + actualVaue);

		// soft assertion and hard assertion
	}

}
