package com.bayamp.training.sonia.web.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.web.selenium.pageobject.BayAmpLoginPage;
import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;
import com.bayamp.web.selenium.pageobjects.ErrorPage;
import com.bayamp.web.selenium.pageobjects.LoginPage;

public class SeleniumBayAmpLoginTest extends BaseTest {
	private static final By LOGOUT_LOCATOR = By.id("lblUserNameTxt");
	private WebDriver driver;
	
	@Test
	public void loginPositiveTest() throws InterruptedException{
		
		WebDriver driver=initDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		
		Page homePage = loginPage.login("user3@bayamp.com", "user3");
		
		Assert.assertTrue(homePage instanceof Page);
		
	}
	
	/*
	 * Invalid UserId and password
	 * 
	 * 
	 * */
	
	@Test
	public void loginNegativeTest() throws InterruptedException{
		
		 driver=initDriver();
		 LoginPage loginPage = new LoginPage(driver);
	
		Page errorPage =loginPage.login("user3", "user3");
		Assert.assertTrue(errorPage instanceof ErrorPage);
		
	}
	
	/*
	 * Blank UserID and Password 
	 * 
	 * 
	 * */
	
	@Test
	public void loginNegativeTest1() throws InterruptedException{
		
		WebDriver driver=initDriver();
		String expectedErrorMessage= "You must specify a username to log in.";
		BayAmpLoginPage loginPage = new BayAmpLoginPage(driver);
		
		String errorMsg=loginPage.incorredUserPasslogin("", "");
		Assert.assertEquals(errorMsg, expectedErrorMessage);
		
	}
	
	/*
	 * UserID has special characters other than @ 
	 * */
	@Test
	public void loginNegativeTest2() throws InterruptedException{
		
		WebDriver driver=initDriver();
		String expectedErrorMessage= "The submitted username is invalid.";
		BayAmpLoginPage loginPage = new BayAmpLoginPage(driver);
		
		String errorMsg=loginPage.incorredUserPasslogin("User@$$@$@$", "");
		Assert.assertEquals(errorMsg, expectedErrorMessage);
		
	}
	
	/*
	 * UserID correct but password is incorrect
	 * */
	@Test
	public void loginNegativeTest3() throws InterruptedException{
		
		WebDriver driver=initDriver();
		String expectedErrorMessage= "";
		BayAmpLoginPage loginPage = new BayAmpLoginPage(driver);
		
		String errorMsg=loginPage.incorredUserPasslogin("user3@bayamp.com", "us");
		Assert.assertEquals(errorMsg, expectedErrorMessage);
		
	}
	
	/*
	 * Check Login Page Link
	 * */
	@Test
	public void checkLoginPageLinks() throws InterruptedException{
		
		WebDriver driver=initDriver();
		int expectedLinks= 2;
		BayAmpLoginPage loginPage = new BayAmpLoginPage(driver);
		
		int actualCount=loginPage.countAllHrefLinkonLoginPage();
		Assert.assertEquals(actualCount, expectedLinks);
		
	}
	
	

}
