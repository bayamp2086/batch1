package com.bayamp.web.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//All LogiPage Locators here
	private static final By USER_LOCATOR = By.cssSelector("#user");
	private static final By PASSWORD_LOCATOR = By.cssSelector("#pass");
	private static final By SIGNIN_LOCATOR = By.cssSelector(".button");
	private static final By LOGOUT_LOCATOR = By.id("lblUserNameTxt");
	private static WebDriver driver;
	
	//All methods here

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String login(String string, String string2) {
		driver.findElement(USER_LOCATOR).sendKeys("user2@bayamp.com");
		driver.findElement(PASSWORD_LOCATOR).sendKeys("user2");
		driver.findElement(SIGNIN_LOCATOR).click();
		String emailAccount = driver.findElement(LOGOUT_LOCATOR).getText();
		return emailAccount;
	}
}
