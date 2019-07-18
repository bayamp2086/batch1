package com.bayamp.archana.training.testng;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class MPassWordTestng {


	@Test(expectedExceptions = {RuntimeException.class })
	public static void exceptionThrownWithNegativeValues() throws Exception  {
		String inputData = null;
		boolean expected = MPasswordUtility.isCorrectPassword(inputData);
	}
	@ Test()
	public static void positiveValues() {
		String input ="Archu19@";
		boolean expected = true;
		boolean actual = MPasswordUtility.isCorrectPassword(input);
		Assert.assertEquals(actual, expected); 
	}
	@DataProvider(name = "splCharcDataProvider")
	public static Object[][]splCharcDataProvider(){
		return new Object[][] {{"Archu19!"},{"Archu19@"},{"Archu19$"},{"Archu19%"},{"Archu19#"}};	
	}
	@ Test(dataProvider = "splCharcDataProvider")
	public static void splCharc(String data) {
		boolean expected = true;
		boolean actual = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected);
	}
	@DataProvider(name = "SplCharcNegativeDataProvider")
	public static Object[][]splCharcDataNegativeProvider1(){
		return new Object[][] {{"Archu@19"},{"@@#@#@"},{"Archu19@$"},{"Archu19&"} };	
	}
	@Test(dataProvider = "SplCharcNegativeDataProvider")
	public static void splCharcNeg(String data) {
		boolean expected = false;
		boolean actual = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}
	@DataProvider(name = "aplhaNumDataProvider")
	public static Object[][]aplhaNumDataProvider(){
		return new Object[][] {{"archu19@"},{"ArChu19@"},{"Archanaa@"},{"12345678@"}};	
	}
	@ Test(dataProvider = "aplhaNumDataProvider")
	public static void pwContainsAlphaNum(String data) {
		boolean expected = false;
		boolean actual = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}
	@DataProvider(name = "lengthDataProvider")
	public static Object[][]lengthDataProvider1(){
		return new Object[][] {{"Ar19@"},{"Arc19@"},{"Archu819@"},{"Arch19@"}};	
	}
	@ Test(dataProvider = "lengthDataProvider")
	public static void pwContainsLength(String data) {
		boolean expected = false;
		boolean actual = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}
	@DataProvider(name = "SpaceDataProvider")
	public static Object[][]spaceDataProvider1(){
		return new Object[][] {{"Arch 19@"},{" rchu19#"},{"Arch19#"} };	
	}
	@Test(dataProvider = "SpaceDataProvider")
	public static void space(String data) {
		boolean expected = false;
		boolean actual = MPasswordUtility.isCorrectPassword(data);
		Assert.assertEquals(actual, expected); 
	}
}

