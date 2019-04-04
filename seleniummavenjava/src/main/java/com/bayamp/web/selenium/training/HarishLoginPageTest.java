package com.bayamp.web.selenium.training;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;
import com.bayamp.web.selenium.pageobjects.ErrorPage;
import com.bayamp.web.selenium.pageobjects.HomePage;
import com.bayamp.web.selenium.pageobjects.LoginPage;

public class HarishLoginPageTest extends BaseTest {
	
	@Test
	public void loginPositiveTest(){
				
		WebDriver driver = initDriver();
		String expectedEmailAccount = "user2@bayamp.com";
		LoginPage loginPage = new LoginPage(driver);
		Page page = loginPage.login("user2@bayamp.com","user2");

		Assert.assertTrue(page instanceof HomePage);
		
	}
	
	@Test
	public void loginInvalidPasswordTest(){
				
		WebDriver driver = initDriver();

		LoginPage loginPage = new LoginPage(driver);
		Page page = loginPage.login("user2@bayamp.com","invalid");
		
		Assert.assertTrue(page instanceof ErrorPage);
		
		ErrorPage errPage = (ErrorPage)page;
		
		String errorMessage = errPage.getText();
		
	}
	

}
