package com.bayamp.akshatha.training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.akshatha.training.utils.MapUtils;

public class MapExampleTest {

@Test
public void countryPositiveTest() {
	String inputData="India";
	String expectedOutputData="New Delhi";
	
	String actualOutput="";
	try {
		actualOutput = MapUtils.getCapital(inputData);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		Assert.fail("failed");
	}
	Assert.assertEquals(actualOutput, expectedOutputData);
}

@Test
public void countryNegativeTest(){
	String inputData="Germany";
	String expectedOutputData=inputData+" does not exist in the map data base";
	
	try {
	String actualOutput=MapUtils.getCapital(inputData);
	//Testing for developers code in case even with wrong output it doesnt throw exceptions
	Assert.fail("No Exception thrown:Expected Run time Exception");
	}catch(Exception e) {
		System.out.println("Right Validation");
		String message=e.getMessage();
		Assert.assertEquals(message, expectedOutputData);
	}
}

@Test
public void countryNumberFormatTest() {
	
	String value1="123h";
	String value2="234";
	
	int total=Integer.parseInt(value1)+Integer.parseInt(value2);
	
	System.out.println(total);
	int[] myValues= {1,2,3};
	
}

}
