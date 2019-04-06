package com.bayamp.chaya.training.web.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonNthElementPage {
	private WebDriver driver;
	private static final By SEARCH_LOCATOR = By.xpath("//input[@name='field-keywords']");
	private static final By NTH_ELEMENT_LOCATOR = By.xpath(
			"//span[contains(@data-component-type,'s-product-image')]//a[1]//div[1]//img[contains(@data-image-index,'4')]");
	private static final By PRICE_OF_NTH_ELEMENT_LOCATOR = By.cssSelector("#priceblock_ourprice");

	public AmazonNthElementPage(WebDriver driver) {
		this.driver = driver;
	}

	public void search_NthElement(String search) throws InterruptedException {
		driver.findElement(SEARCH_LOCATOR).sendKeys(search);
		driver.findElement(SEARCH_LOCATOR).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(5000);
		driver.findElement(NTH_ELEMENT_LOCATOR).click();
		System.out.println("Price is: " + driver.findElement(PRICE_OF_NTH_ELEMENT_LOCATOR).getText());

	}
}
