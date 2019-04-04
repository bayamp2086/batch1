package com.bayamp.chaya.training.web.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BayampLoginPage {
	/**
	 * This class contains the Web Elements for the BayAmp Login page and method
	 * to send values
	 */
	private static final By BAYAMP_USERNAME_LOCATOR = By.cssSelector("#user");
	private static final By BAYAMP_PASSWORD_LOCATOR = By.cssSelector("#pass");
	private static final By LOGIN_LOCATOR = By.cssSelector(".button");
	private static final By HEADER_LOCATOR = By.id("masterAppContainer");
	private static final By LOGIN_STATUS_MESSAGE = By.cssSelector("#login-status-message");
	private static final By LOGIN_STATUS_MESSAGE1 = By.xpath("//h2[contains(text(),'Log Into Your Account')]");

	private WebDriver driver;

	public BayampLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void bayaAmplogin(String string, String string2) {
		driver.findElement(BAYAMP_USERNAME_LOCATOR).sendKeys(string);
		driver.findElement(BAYAMP_PASSWORD_LOCATOR).sendKeys(string2);
		driver.findElement(LOGIN_LOCATOR).click();
	}

	public String getLoginHeader() {
		String header_text = driver.findElement(HEADER_LOCATOR).getText();
		return header_text;
	}

	public String getLoginStatusMessage() {
		String loginStatusMessage = driver.findElement(LOGIN_STATUS_MESSAGE).getText();
		return loginStatusMessage;
	}
	public String getInvalidPasswordStatusMessage() {
		String invalidPAsswordStatusMessage = driver.findElement(LOGIN_STATUS_MESSAGE1).getText();
		return invalidPAsswordStatusMessage;
	}
	
}
