package com.bayamp.training.sonia.web.selenium.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BayAmpLoginPage {
	//All LogiPage Locators here
	//private static final By USER_LOCATOR = By.cssSelector("#user");
	//private static final By PASSWORD_LOCATOR = By.cssSelector("#pass");
	
	private static final By USER_LOCATOR=By.xpath(".//input[contains(@id,'user')]");
	private static final By PASSWORD_LOCATOR=By.xpath(".//input[contains(@id,'pass')]");
	private static final By SIGNIN_LOCATOR = By.cssSelector(".button");
	private static final By LOGOUT_LOCATOR = By.id("lblUserNameTxt");
	private static final By LOGIN_ERROR = By.id("login-status-message");
	//private static final By AHREF = By.tagName("a");
	private static final By AHREF = By.xpath(".//a[contains(@href,'http')]");
	

	
	private WebDriver driver;
	
	//All methods here

	public BayAmpLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String login(String user, String pwd) throws InterruptedException {
		driver.findElement(USER_LOCATOR).sendKeys(user);
		driver.findElement(PASSWORD_LOCATOR).sendKeys(pwd);
		driver.findElement(SIGNIN_LOCATOR).click();
		Thread.sleep(2000);
		String emailAccount = driver.findElement(LOGOUT_LOCATOR).getText();
		return emailAccount;
	}
	
	public String incorredUserPasslogin(String user, String pwd) throws InterruptedException {
		driver.findElement(USER_LOCATOR).sendKeys(user);
		driver.findElement(PASSWORD_LOCATOR).sendKeys(pwd);
		driver.findElement(SIGNIN_LOCATOR).click();
		String errorMsg = driver.findElement(LOGIN_ERROR).getText();
		return errorMsg;
		
	}
	
	public int countAllHrefLinkonLoginPage() {
	
		List<WebElement> webelement=driver.findElements(AHREF);
		System.out.println(webelement.size());
		
		for(WebElement element:webelement) {
			System.out.println(element.getText() + "     "+element.getAttribute("href"));
		}
		
		return webelement.size();
	}

	
	
}
