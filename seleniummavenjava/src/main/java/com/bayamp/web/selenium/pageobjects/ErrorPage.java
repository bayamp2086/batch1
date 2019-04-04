package com.bayamp.web.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class ErrorPage extends Page {
	
	private static final By LOGIN_ERROR = By.id("login-status-message");
	
	public ErrorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isLoaded() {
	
		return driver.findElement(LOGIN_ERROR).isDisplayed();
		
	}

	public String getText() {
		return driver.findElement(LOGIN_ERROR).getText();
	}

}
