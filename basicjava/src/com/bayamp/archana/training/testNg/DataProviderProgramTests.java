package com.bayamp.archana.training.testNg;

import java.util.HashMap;
import java.util.Map;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(groups= {"regression", "api"})
public class DataProviderProgramTests {
	
	@DataProvider(name = "getDataFromMap")
	private Object[][] getData1(){
		
		Map<String,Integer> data4 = new HashMap<String,Integer>();
		data4.put("num1", 8);
		data4.put("num2", 8);
		data4.put("expected", 16);
		Object[][] data = {{data4}};
		return data;
		}

	@Test(priority=1, groups={"p1","addition"}, dataProvider = "getDataFromMap" )
	public void addNumbersTestFromMapData(Map<String,Integer> data) {
	int actualtotal = data.get("num1")+data.get ("num2");
	Reporter.log(""+actualtotal, true);
	}
}
