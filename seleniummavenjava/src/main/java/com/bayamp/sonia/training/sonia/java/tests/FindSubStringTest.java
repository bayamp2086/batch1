package com.bayamp.sonia.training.sonia.java.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.javaprogram.DataFile;
import com.bayamp.training.sonia.javaprogram.FindSubString;


public class FindSubStringTest {
	
	
	@Test(description="checkSubString",dataProvider="SubStringData",dataProviderClass=com.bayamp.training.sonia.javaprogram.DataProviderUtility.class)
	@DataFile(file="src/main/resources/TestData.csv")
	public void checkSubString(HashMap<String, String> inputStringMap) {
		
		String inputString="Its a very good day";
		String subStr=(String)inputStringMap.get("string");
		boolean expected=Boolean.valueOf(inputStringMap.get("expected"));
		
		boolean actualPresent=FindSubString.checkStringNew(inputString, subStr);
		
		Assert.assertEquals(actualPresent, expected);
		Reporter.log("Input String :"+inputString);
		Reporter.log("Sub String :"+subStr);
		Reporter.log("Expected :"+expected);
		Reporter.log("Actual :"+actualPresent);
		
		
	}
	

}
