package com.bayamp.sonia.training.testng;

import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.sonia.training.annotation.DataFile;
import com.bayamp.sonia.training.utils.StringUtility;

public class ReverseStringProgramTest {
	
	@Test(description="ReverseString", dataProvider="getDataforReverseString",
			dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@DataFile(file="resources/revertString.csv")
	public void testReverseString(Map <String,String>reverseStringMAp) {
		
		String inputString=(String)reverseStringMAp.get("string");
		String expected=(String)reverseStringMAp.get("expected");
		
		String actual=StringUtility.reverseString(inputString);
		
		Assert.assertEquals(actual, expected);
		
		Reporter.log(actual);
		
	}

}
