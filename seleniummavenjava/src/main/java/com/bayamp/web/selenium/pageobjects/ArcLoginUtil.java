package com.bayamp.web.selenium.pageobjects;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.propertyFileForLogin;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class ArcLoginUtil {
	
	public static final String resource_Path = "/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/resources/LoginPage.csv";
	//All locators 
	private static final By User = By.id("user");
	private static final By Password = By.cssSelector("#pass") ;
	private static final By loginButton = By.cssSelector(".button");
	private static final By  logoutImage = By.id("lblLogout");
	private static final By errorLoginIdEle = By.id("login-status-message");
	
	private static WebDriver driver;

	public ArcLoginUtil(WebDriver driver) {
		this.driver = driver;	
	}


	//All methods 
	

	public static boolean negLogin(){
		driver.findElement(loginButton).click();
		boolean errorMessageDisplay = driver.findElement(By.cssSelector(".content-wrapper")).isDisplayed();
		String errorMessageDisplayText = driver.findElement(By.cssSelector(".content-wrapper")).getText();
		String color = driver.findElement(By.cssSelector(".content-wrapper")).getCssValue("color");
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		if (errorMessageDisplayText.equals("You must specify a username to log in.")&& hex.equals("#ffffff")) {
				System.out.println("The Error message is displayed correctly");
			}
		return errorMessageDisplay;

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
	void testLogin(Map<String,String> data) throws InterruptedException {
		String email = data.get("EMAIL");
		String password = data.get("PASSWORD");
	    String expectedErrMsg =data.get("EXPECTED");
		propertyFileForLogin login  = new propertyFileForLogin();
		WebDriver driver = login.readPropertiesFile();
		if(!email.equalsIgnoreCase("empty")) {
			driver.findElement(User).sendKeys(email);
		}
		if(!password.equalsIgnoreCase("empty")) {
			driver.findElement(Password).sendKeys(password);
		}
		
		driver.findElement(User).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(loginButton).click();
		Thread.sleep(2000);
		
		
		boolean errorMessageDisplay = driver.findElement(errorLoginIdEle).isDisplayed();
		String errorMessage = null;
		if (errorMessageDisplay) {
			 errorMessage = driver.findElement(errorLoginIdEle).getText();
		}
		
		Assert.assertTrue(expectedErrMsg.trim().equals(errorMessage.trim()), " Failure in the error message");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
