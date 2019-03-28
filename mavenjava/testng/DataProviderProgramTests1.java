package com.bayamp.chaya.training.testng;

import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.chaya.training.math.util.PrimeNumber;

@Test(groups = { "regression", "api" })
public class DataProviderProgramTests1 {

	@Test(priority = 0, groups = "{}", dataProvider = "getMyData", dataProviderClass = com.bayamp.chaya.training.dataproviderutility.DataProviderProgramTest.class)
	public void addNumbersTest(int[] testData) {
		// int actualTotal = num1+num2;
		Object actualTotal = testData[0] + testData[1];
		Reporter.log("" + actualTotal, true);

	}

	@Test(priority = 1, groups = "{}", dataProvider = "getMyDatafromhashMap", dataProviderClass = com.bayamp.chaya.training.dataproviderutility.DataProviderProgramTest.class)
	public void addNumbersTestFromMapData(Map<String, Integer> data) {
		int actualTotal = data.get("num1") + data.get("num2");
		int expected = data.get("expected");
		// validations
		Assert.assertEquals(actualTotal, expected);
		// reporting
		Reporter.log("" + actualTotal, true);

	}

	@Test(priority = 1, groups = "{ }", dataProvider = "getMyDatafromCSV", dataProviderClass = com.bayamp.chaya.training.dataproviderutility.DataProviderProgramTest.class)
	// @Data(file="src/main/resources/data")
	public void addNumbersTestFromCSV(Map<String, Integer> data) {
		int actualTotal = AddUtils.addtwonumbers(data.get("num1"), data.get("num2"));
		int expected = data.get("expected");
		// validations
		Assert.assertEquals(actualTotal, expected);
		// reporting
		Reporter.log("" + actualTotal, true);

	}
@Test(dataProvider="isprime",dataProviderClass = com.bayamp.chaya.training.dataproviderutility.DataProviderProgramTest.class)
public void isPrimeValidation(int inputnumber,boolean expected){
	System.out.println(inputnumber+" "+expected);
	Assert.assertEquals(expected, PrimeNumber.primeCheck(inputnumber));
	
	
}
}
