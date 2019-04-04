package com.bayamp.web.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class LoginPage extends Page {
	
	//All LogiPage Locators here
	private static final By USER_LOCATOR = By.cssSelector("#user");
	private static final By PASSWORD_LOCATOR = By.cssSelector("#pass");
	private static final By SIGNIN_LOCATOR = By.cssSelector(".button");

	//All methods here

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public Page login(String string, String string2) {
		driver.findElement(USER_LOCATOR).sendKeys("user2@bayamp.com");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("user2");
		driver.findElement(SIGNIN_LOCATOR).click();
		
		HomePage homePage =new HomePage(driver);
		
		if(homePage.isLoaded()) {
			return homePage;
		}else {
			return new ErrorPage(driver);
		}
	}
}
