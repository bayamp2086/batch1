package com.bayamp.archana.training.selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.propertyFileForLogin;
import com.bayamp.web.selenium.pageobjects.LoginPageUtilByArc;

public class LoginTestByArchu {
	public static final String resource_Path = "/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/resources/LoginPage.csv";
	@ Test 
	public void positiveTest() {
		String expectedLogoutImage = "Logout";
		String actualLogoutImage = LoginPageUtilByArc.positiveTest();
		Assert.assertEquals(actualLogoutImage, expectedLogoutImage);
	}
	
	@DataProvider(name = "passwordFromCSVProvider")
	private static Object[][] passWordTestProvider() throws IOException {
		System.out.println("IN the data provider");
		FileReader loginTestFile = new FileReader (resource_Path);
		CSVParser passwdParser = new CSVParser(loginTestFile, CSVFormat.DEFAULT);
		List<CSVRecord> csvRows = passwdParser.getRecords();
		CSVRecord header = csvRows.get(0);
		Object[][] data = new Object[csvRows.size()-1][1];
		int counter = 0;
		for (int i =1; i<csvRows.size();i++) {
			CSVRecord row = csvRows.get(i);
			Map<String,String> mapData = new HashMap<String,String>();
			mapData.put(header.get(0), row.get(0));
			mapData.put(header.get(1), row.get(1));
			mapData.put(header.get(2), row.get(2));
			data[counter][0] = mapData;
			counter++;
		}
		System.out.println(csvRows.size());
		return data;
	}
	
	@Test(dataProvider = "passwordFromCSVProvider")
	public void negTestLogin(Map<String,String> data) throws InterruptedException {
		String email = data.get("EMAIL");
		String password = data.get("PASSWORD");
		String expectedErrMsg =data.get("EXPECTED");
		propertyFileForLogin login  = new propertyFileForLogin();
		WebDriver driver = login.readPropertiesFile();
		if(!email.equalsIgnoreCase("empty")) {
			driver.findElement(By.id("user")).sendKeys(email);
		}
		if(!password.equalsIgnoreCase("empty")) {
			driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		}
		driver.findElement(By.cssSelector(".button")).click();
		Thread.sleep(2000);


		boolean errorMessageDisplay = driver.findElement(By.id("login-status-message")).isDisplayed();
		String errorMessage = "no message";
		if (errorMessageDisplay) {
			errorMessage = driver.findElement(By.id("login-status-message")).getText();
		}

		Assert.assertTrue(expectedErrMsg.trim().equals(errorMessage.trim()), " Failure in the error message");
		driver.close();
		//driver.quit();
	}

	@ Test 
	public void logoutMessageTest() {
		String expectedMessgae = "You have logged out.";
		String actualMessgae = LoginPageUtilByArc.logoutMessageTest();
		Assert.assertEquals(actualMessgae, expectedMessgae);
	}
	
	@ Test 
	public void loginPageElementTest() {
		boolean expectedResult = true;
		boolean actualResult = LoginPageUtilByArc.loginPageElement();
		Assert.assertEquals(actualResult, expectedResult);
	}

}
