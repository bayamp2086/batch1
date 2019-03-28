package com.bayamp.sonia.training.testng;

import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgramTests {
	
	
	@DataProvider(name="SoniaData")
	private Object[][] getData(){
		
		
		
		int[] dataset1= {5,5};
		int [] dataset2= {3,4};
		int [] dataset3= {1,2};
		
		//Object[][]data= {{dataset1},{dataset2},{dataset3}};
		
		
		Map <String,Integer> dataMap=new HashMap<String,Integer> ();
		
		dataMap.put("numb1", 5);
		dataMap.put("numb2", 5);
		
		Map <String,Integer> dataMap1=new HashMap<String,Integer> ();
		
		dataMap1.put("numb1", 3);
		dataMap1.put("numb2", 4);
		
		
		Map <String,Integer> dataMap2=new HashMap<String,Integer> ();
		
		dataMap2.put("numb1", 1);
		dataMap2.put("numb2", 2);
		
		Object[][]data= {{dataMap},{dataMap1},{dataMap2}};
		
		return data;
		
	}
	
	@Test(dataProvider="SoniaData")
	public void addNumbersTest(Map <String,Integer> dataMap2 ) {
		
		int actual=dataMap2.get("numb1")+dataMap2.get("numb2");
		Reporter.log(""+actual);
		
	}

}
