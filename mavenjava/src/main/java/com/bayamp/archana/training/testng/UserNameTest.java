package com.bayamp.archana.training.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserNameTest {

private static final String UserRegx = "^[A-Z][a-z]{4,7}";
	public static boolean UserNameIsValid(String UserName) {
		if (UserName == null ) 
		System.out.println("Please enter the UserName");
		
		if (UserName!=null && UserName.matches(UserRegx) ){
			System.out.println("UserName is entered");
			return true;
		}
		System.out.println("UserName is not valid");
		return false;
	}

	
	
	@Test
	@Parameters({"UserName"})
	public static void UserName(String UserName) {
		boolean actual = true;
		boolean expected = UserNameTest.UserNameIsValid(UserName);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider (name = "UserNameDataProviderNeg")
	public static Object[][] UserNameTestProviderNeg(){
		Object[][] obj = new Object[][] {{"6768"},{null}};
		return obj ;	
	}
	@Test (dataProvider = "UserNameDataProviderNeg")
	public static void UserNameFail(String UserName) {
		boolean actual = false;
		boolean expected = UserNameTest.UserNameIsValid(UserName);
		Assert.assertEquals(actual, expected);
	}
	
	/*@DataProvider (name = "UserNameDataProvider")
	public static Object[][] UserNameTestProvider(){
		Object[][] obj = new Object[][] {{"Archu"}};
		return obj ;	
	}*/
	
}
