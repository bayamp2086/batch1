package com.bayamp.web.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class HomePage  extends Page {
	
	private static final By LOGOUT_LOCATOR = By.id("lblUserNameTxt");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isLoaded() {
		
/*		if(isElementPresent(LOGOUT_LOCATOR1) && isElementPresent(LOGOUT_LOCATOR2) ) {
			return true;
		}*/
		
		return driver.findElement(LOGOUT_LOCATOR).isDisplayed();

		
	}
}
