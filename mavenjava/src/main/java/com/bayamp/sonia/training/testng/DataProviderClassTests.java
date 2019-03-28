package com.bayamp.sonia.training.testng;

import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.sonia.training.annotation.File;
import com.bayamp.sonia.training.utils.MathUtil;

@Test(groups= {"regression","web"})
public class DataProviderClassTests {
	
	
	
	@Test(description="jiraid", priority=1, groups={"api","p1"}, 
			dataProvider="getDatafromCSV",
			dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	
	@File(file="resources/inputData.csv")
	public void getAdditionTest(Map <String,String> dataMap) {
		
		//System.out.println(dataMap.size());
		
		int numb1=Integer.valueOf(dataMap.get("numb1"));
		int numb2=Integer.valueOf(dataMap.get("numb2"));
		int actual=MathUtil.addNumbers(numb1,numb2);
		int expected=Integer.valueOf(dataMap.get("expected"));
		
		Assert.assertEquals(actual, expected);
		Reporter.log(""+actual);
	}
	
	

}
