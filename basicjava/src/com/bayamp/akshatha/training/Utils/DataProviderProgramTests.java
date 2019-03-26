package com.bayamp.akshatha.training.Utils;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgramTests {
	
	@DataProvider
    public Object[][] getData() {
		
		Object[][] data={{5, 7, 12}, {6, 9, 15}};
		
        return data;
    }
	
	
	@DataProvider(name="getMyDataArray")
	private Object[][] getDataArray(){
	
		
		Object[] dataSet1= {5,5}; Object[] dataSet2= {6,6}; Object[] dataSet3= {7,7};
		
		Object[][] data= {{dataSet1},{dataSet2},{dataSet3}};
		
		return data;
	}
	
	
	@DataProvider(name="getMyDataFromMap")
	private Object[][] getDataFromMap(){
	
		Map<String,Integer> map1=new HashMap<String, Integer>();
		
		map1.put("Num1", 5);
		map1.put("Num2", 7);
		map1.put("Expected", 12);
		
		Map<String,Integer> map2=new HashMap<String, Integer>();
		
		map2.put("Num1", 8);
		map2.put("Num2", 9);
		map2.put("Expected", 17);
		
		
		  Object[][] data=new Object[2][1]; 
		  data[0][0]=map1; 
		  data[1][0]=map2;
		  return data;
		  
		//   return new Object[][] {{map1},{map2}};
		 
		
	//	Object[][] data={{map1},{map2}};
	
		//return data;
		
		
	}
	
	
    @Test(dataProvider= "getData")
	
	public void addNumbersTestInt(int t1,int t2,int e) {
		
		int actualtotal=t1+t2;
		Assert.assertEquals(actualtotal, e);
		Reporter.log(""+actualtotal,true);
		
		
	}
	
	@Test(dataProvider= "getMyDataArray")
	
	public void addNumbersTest(Object[][] testData) {
		for(Object[] d:testData) {
		int actualtotal=(int)d[0]+(int)d[1];
		Reporter.log(""+actualtotal,true);
		}
		
	}
	
@Test(dataProvider= "getMyDataFromMap")
	
	public void addNumbersTestFromMapData(Map<String,Integer> data) {
		
	 int actualTotal=AdditionUtils.addTwoNumbers(data.get("Num1"), data.get("Num2"));
		int expected=data.get("Expected");
		Assert.assertEquals(actualTotal, expected);
		
		Reporter.log(""+actualTotal,true);
		
		
	}
	
    
    @Test(priority=1,groups={"api","p1","addition"},dataProvider= "getMyDataFromCSV",dataProviderClass=DataProviderUtility.class)
    @Data(file="src/main/resources/Data/addition.csv")
    public void addNumbersTestFromCSVData(Map<String,Integer> data) {
			
		    int actualTotal=AdditionUtils.addTwoNumbers((int)data.get("Num1"), data.get("Num2"));
		    
			int expected=data.get("Expected");
			//validations
			Assert.assertEquals(actualTotal, expected);
			//Reporting
			Reporter.log(""+actualTotal,true);
			
			
			
		}
}
