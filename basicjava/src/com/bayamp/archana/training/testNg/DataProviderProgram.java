package com.bayamp.archana.training.testNg;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram {

	@DataProvider(name = "getMyData")
	private Object[][] getData(){
		
		int[] dataset1 = {5,5};
		int[] dataset2 = {6,6};
		int[] dataset3 = {7,7};
		
		Object[][] data1 = { {dataset1},{dataset2},{dataset3}};
		
		//or
		/*Object[][] data = new Object [3][2];
		
		Object[] dataset1 = {5,5};
		Object[] dataset2 = {6,6};
		Object[] dataset3 = {7,7};
		
		data[0] = dataset1;
		data[1] = dataset2;
		data[2] = dataset3;*/
		return data1;
	}
	@Test(dataProvider = "getMyData")
	public void addNumbersTest(int[] testData) {
		int actualtotal = testData[0] +testData[1];
		Reporter.log(""+actualtotal, true);
	}
	
	@DataProvider(name = "getData")
	private Object[][] getData1(){
		
		Map<String,Integer> data4 = new HashMap<String,Integer>();
		data4.put("num1", 8);
		data4.put("num2", 8);
		data4.put("expected", 16);
		Object[][] data = {{data4}};
		return data;
		}
	
	@Test(dataProvider = "getData")
	public void addNumbersTestInMap(Map<String,Integer> data) {
		int actualtotal = data.get("num1")+data.get ("num2");
		Reporter.log(""+actualtotal, true);
	}
	
	@Test(priority=1, groups={"p1","addition"}, dataProvider = "getMyDataFromCSV", dataProviderClass=DataProviderUtil.class)
	public void addNumbersFromCSVData(Map<String,Integer> data) {
		int actualTotal = AdditionUtils.addNumbers(data.get("Num1"), data.get("Num2"));
		int expected = data.get("Expected");
		Assert.assertEquals(actualTotal,expected);
		
	}
}

