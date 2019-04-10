package com.bayamp.archana.training.selenium.pageObjects;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.propertyFileForLogin;

public class LoginPageUtilByArc {
	public static final String resource_Path = "/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/resources/LoginPageByArchu.csv";
	//All locators 
	private static final By User = By.id("user");
	private static final By Password = By.cssSelector("#pass") ;
	private static final By loginButton = By.cssSelector(".button");
	private static final By logout = By.id("lblLogout");
	private static final By errorLoginIdEle = By.id("login-status-message");
	private static final By LogoutMssge = By.id("login-status-message");
	private static final By LoginHeader = By.cssSelector(".page-title");
	private static final By LoginCopyImage = By.cssSelector(".copyright");
	private static final By PaswrdForgotHrefLink = By.linkText("Forgot Password?");
	private static final By NotaCoustomerHrefLink = By.linkText("Not a Customer? Sign Up Now!");
	private static WebDriver driver;
	
	public LoginPageUtilByArc(WebDriver driver) {
		this.driver = driver;	
	}

	//All test
	public static String positiveTest(){
		propertyFileForLogin login  = new propertyFileForLogin();
		WebDriver driver = login.readPropertiesFile();
		driver.findElement(User).sendKeys("user4@bayamp.com");
		driver.findElement(Password).sendKeys("user4");
		driver.findElement(loginButton).click();
		//String expectedLogoutImage = "Logout";
		String actualLogoutImage = driver.findElement(logout).getText();
		if (actualLogoutImage != null) {
			System.out.println("The page has signned in succefully and navigated to the inbox page");
		} else {
			System.out.println("The page failed to sign in");	
		}
		//Assert.assertEquals(actualLogoutImage, expectedLogoutImage);
		driver.close();
		return actualLogoutImage;
	}

	public static String logoutMessageTest() {
		propertyFileForLogin login  = new propertyFileForLogin();
		WebDriver driver = login.readPropertiesFile();
		driver.findElement(User).sendKeys("user4@bayamp.com");
		driver.findElement(Password).sendKeys("user4");
		driver.findElement(loginButton).click();
		//String expectedMessgae = "You have logged out.";
		driver.findElement(logout).click();
		String actualMessgae =driver.findElement(LogoutMssge).getText();
		//Assert.assertEquals(actualMessgae, expectedMessgae);
		driver.close();
		return actualMessgae;

	}

	public static boolean loginPageElement() {
		propertyFileForLogin login  = new propertyFileForLogin();
		WebDriver driver = login.readPropertiesFile();
		driver.findElement(LoginHeader).isDisplayed();
		driver.findElement(LoginCopyImage).isDisplayed();
		driver.findElement(PaswrdForgotHrefLink).isDisplayed();
		driver.findElement(NotaCoustomerHrefLink).isDisplayed();
		driver.close();
		return true;
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
			driver.findElement(User).sendKeys(email);
		}
		if(!password.equalsIgnoreCase("empty")) {
			driver.findElement(Password).sendKeys(password);
		}
		driver.findElement(loginButton).click();
		Thread.sleep(2000);


		boolean errorMessageDisplay = driver.findElement(errorLoginIdEle).isDisplayed();
		String errorMessage = "no message";
		if (errorMessageDisplay) {
			errorMessage = driver.findElement(errorLoginIdEle).getText();
		}

		Assert.assertTrue(expectedErrMsg.trim().equals(errorMessage.trim()), " Failure in the error message");
		driver.close();
		//driver.quit();
	}

}


/*
 * 
 * 
 * test positive scenarios (1)
 * 
 * 
 * 
 * 
 * test negative scenario (5)
 *   Invalid data, boundary value condition and so on.
 *   
 *  dataprovider :
 * input (user, password) expected - error message
 * col 1) scenario 2) user id 3) password 4) expected error message
 * 
 * [data:
 *  String userid;
 *  String password;
 *  string expected_message
 * 
 * ]
 * 
 * [functional action:
 * 
 * 1) load the page 
 * 2) enter userid 
 * 3) enter password
 * 4) hit login button.
 * 5) wait for the error message
 * 6) get the error message and compare it with the expected message
 * ]
 * 
 * 
 * [technical actions :
 *  1) create a web driver 
 *  2) hit the url 
 *  3) find the element id for the userid and enter the userid
 *  4) find the element for the password and enter the password
 *  5) find element for the login button. 
 *  6) find the element for error message and perform gettext operation. 
 *  7) compare text with the exepected message 
 *  
 *  
 *  
 *
 * 
 * 
 * ]
 * 
 * 
 */

