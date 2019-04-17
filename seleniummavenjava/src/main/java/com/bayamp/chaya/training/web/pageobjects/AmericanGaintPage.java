package com.bayamp.chaya.training.web.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmericanGaintPage {
	private WebDriver driver;
	private static final By PRODUCT_LINK_LOCATOR = By
			.xpath("//a[@title='Classic Full Zip']//img[contains(@class,'lazyloaded')]");
	private static final By PRODUCT_COLOR = By.xpath("//span[contains(@class,'lazyloaded')][contains(text(),'Black')]");
	private static final By PRODUCT_SIZE = By.xpath("//a[@title='Select size: Medium']");
	private static final By PRODUCT_QUANTITY_INCREASE_BUTTON = By.xpath("//button[contains(text(),'+')]");
	private static final By ADD_CART_LOCATOR = By.xpath("//button[@title='Add to Bag']");
	private static final By SUBTOTAL_VALUE_1 = By.xpath(
			"//div[@class='reveal-overlay']//div[@id='addtocartconfirmation']//div[@id='ajaxRevealContent']//div[@class='mini-cart-totals']//div[contains(@class,'mini-cart-subtotals')]//span[contains(@class,'value')]");
	private static final By CHECKOUT_LOCATOR = By.xpath("//a[@title='Go to Cart']");
	private static final By TOTAL_VALUE = By.xpath("//div[contains(@class,'line-item-total-price-amount')]");
	private static final By POPUP_HIDE = By.xpath("//div[@class='addshop-overlay active']");

	public AmericanGaintPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isTotalValid() throws InterruptedException {
		checkForPopUpAndHide();
		driver.findElement(PRODUCT_LINK_LOCATOR).click();
		driver.findElement(PRODUCT_COLOR).click();
		Thread.sleep(2000);
		checkForPopUpAndHide();
		driver.findElement(PRODUCT_SIZE).click();
		Thread.sleep(2000);
		checkForPopUpAndHide();
		driver.findElement(PRODUCT_QUANTITY_INCREASE_BUTTON).click();
		Thread.sleep(2000);
		checkForPopUpAndHide();
		driver.findElement(ADD_CART_LOCATOR).click();
		Thread.sleep(2000);
		checkForPopUpAndHide();
		String value1 = driver.findElement(SUBTOTAL_VALUE_1).getText();
		String valuez = driver.findElement(SUBTOTAL_VALUE_1).getTagName();
		System.out.println("Sub total value:" + value1 + "v2" + valuez);
		Thread.sleep(2000);
		driver.findElement(CHECKOUT_LOCATOR).click();
		Thread.sleep(2000);
		String value2 = driver.findElement(TOTAL_VALUE).getText();
		System.out.println(" total value:" + value2);
		if (value1.equals(value2)) {
			return true;
		} else
			return false;
	}

	public void checkForPopUpAndHide() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(POPUP_HIDE);
			js.executeScript("arguments[0].style.display='none'", element);
		} catch (NoSuchElementException e) {
			System.out.println("Error while executing: " + e.getMessage());
		}
	}
}
