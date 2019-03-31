package com.bayamp.sonia.training.testng;

import java.util.Map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.sonia.training.annotation.File;
import com.bayamp.sonia.training.utils.StringUtility;

public class PasswordMatchingProgramTest {
	
	@Test(description="matchPasswordPattern", dataProvider="getDataforPassword",
	dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@File(file="src/main/resources/passwordMatch.csv")
	public void matchPasswordPattern(Map <String,String>passwordMatching) {
		
		boolean expected=Boolean.valueOf(passwordMatching.get("expected"));
		String password=passwordMatching.get("password");
		boolean actual=StringUtility.checkPasswordpattern(password);
		Assert.assertEquals(actual, expected);
		Reporter.log(""+actual);
	}
	
	
	@Test(description="matchPasswordPattern1",dataProvider="getDataforPassword",
	dataProviderClass=com.bayamp.sonia.training.utils.DataProviderUtility.class)
	@File(file="src/main/resources/passwordMatch.csv")
	public void matchPasswordPattern1(Map <String,String>passwordMatching) {
		
		boolean expected=Boolean.valueOf(passwordMatching.get("expected"));
		String password=passwordMatching.get("password");
		boolean actual=StringUtility.checkPasswordpattern1(password);
		Assert.assertEquals(actual, expected);
		Reporter.log(""+actual);
	}

}
