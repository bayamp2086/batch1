package com.bayamp.web.selenium.training;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.pageobjects.LoginPage;

public class HarishLoginPageTest extends BaseTest {
	
	@Test
	public void loginPositiveTest(){
				
		WebDriver driver = initDriver();
		String expectedEmailAccount = "user2@bayamp.com";
		LoginPage loginPage = new LoginPage(driver);
		String emailAccount = loginPage.login("user2@bayamp.com","user2");
		Assert.assertEquals(emailAccount,expectedEmailAccount);
		
	}
	
	@Test
	public void loginInvalidPasswordTest(){
				
		WebDriver driver = initDriver();
		String expectedEmailAccount = "user2@bayamp.com";
		LoginPage loginPage = new LoginPage(driver);
		String emailAccount = loginPage.login("user2@bayamp.com","invalid");
		
	}
	
	@Test
	public void loginInvalidUserIDTest(){
				
		WebDriver driver = initDriver();
		String expectedEmailAccount = "xser22@bayamp.com";
		LoginPage loginPage = new LoginPage(driver);
		String emailAccount = loginPage.login("user2@bayamp.com","invalid");
		
		
	}
	

}
