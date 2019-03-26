package com.bayamp.sonia.training.testng;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bayamp.sonia.training.utils.MathUtil;

public class AdditionTests {

	@BeforeClass
	public void loadStart() {
		System.out.print("Load Started");

	}

	@DataProvider
	public Object[][] myData() {
		int arr1[] = { 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 3, 4, 4, 6 };
		int arr3[] = { 1, 3, 4, 2, 6 };

		Object myData[][] = { { arr1, 20 }, { arr2, 18 }, { arr3, 16 } };

		return myData;
	}

	@Test(dataProvider = "myData")
	public void arrayAddition(int InputData[], int expected) {

		// int inputArr[]= {1,4,5,6};
		// int expected=16;
		int actual = MathUtil.addNumbers(InputData);

		Assert.assertEquals(actual, expected);

		Reporter.log("InputData :" + Arrays.toString(InputData));
		Reporter.log("Expected Output :" + expected + " Actual Output :" + actual);
	}

	@Test(dataProvider = "myData")
	public void arrayAdditionNegative(int InputData[], int expected) {

		int actual = MathUtil.addNumbers(InputData);

		Assert.assertEquals(actual, expected);
		
		Reporter.log("InputData :" + Arrays.toString(InputData));
		Reporter.log("Expected Output :" + expected + " Actual Output :" + actual);
	}

	@Test
	public void arrayAdditionNull() {

		int InputData[] = {};

		int actual = MathUtil.addNumbers(InputData);

		Assert.assertNull(actual);
	}

	@AfterClass
	public void loadEnd() {

		System.out.print("Load End");

	}

}
