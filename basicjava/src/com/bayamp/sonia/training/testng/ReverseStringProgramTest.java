package com.bayamp.sonia.training.testng;

import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.sonia.training.annotation.DataFile;
import com.bayamp.sonia.training.utils.StringUtility;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class ReverseStringProgramTest {
	
	@Test(description="ReverseString", dataProvider="getDataforReverseString",
			dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@DataFile(file="resources/revertString.csv")
	public void testReverseString(Map <String,String>reverseStringMAp) {
		
		String inputString=reverseStringMAp.get("string");
		String expected=reverseStringMAp.get("expected");
		
		String actual=StringUtility.reverseString(inputString);
		
		Assert.assertEquals(actual, expected);
		
		Reporter.log(actual);
		
	}
	
	
	
	@Test(description="testreverseword", dataProvider="getDataforReverseString",
			dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@DataFile(file="resources/revertString.csv")
	public void testreverseWord(Map<String,String>reverseWordMap) {
		
		String inputString=reverseWordMap.get("string");
		String expected=reverseWordMap.get("expected");
		String actual=StringUtility.getreverseWords(inputString);
		SystemPrintClass.print(actual);
		
		Assert.assertEquals(actual, expected);
		
		Reporter.log(actual);
		
	}
	
	@Test(description="findDuplicateChar",dataProvider="getDataforReverseString",
			dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@DataFile(file="resources/revertString.csv")
	public void testDuplicateChar(Map<String,String>duplicateCharMap) {
		
		String inputString=duplicateCharMap.get("string");
		String expected=duplicateCharMap.get("expected");
		String actual=StringUtility.findDuplicateCharinString(inputString);
		SystemPrintClass.print("Actual :"+actual);
		SystemPrintClass.print("Expected :" +expected);
		
		Assert.assertEquals(actual, expected);
		
		Reporter.log(actual);
		
	}

}
