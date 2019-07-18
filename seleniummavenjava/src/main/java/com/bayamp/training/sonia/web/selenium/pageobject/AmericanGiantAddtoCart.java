package com.bayamp.training.sonia.web.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bayamp.web.selenium.common.Page;

public class AmericanGiantAddtoCart extends Page {

	public static final By FirstLink = By
			.xpath(".//div[contains(@class,'product-image')]/a[contains(@class,'thumb-link')]");
	public static final By SHOP_ADD = By.xpath(
			".//div[contains(@class,'addshop-submit')]/div[contains(@class,'addshop-overlay')]/div[contains(@class,'addshop-modal')]");
	public static final By SHOP_ADD_NOTHANKS = By.xpath(
			".//div[contains(@class,'addshop-overlay')]//div[contains(@class,'addshop-model')]//div[contains(@class,'addshop-model-inner')]//div[contains(@class,'addshop-step')]//div[contains(@class,'addshop-close')]");
	public static final By SHOP_ADD_SIZE = By.xpath(".//ol[@class='sizes']/li[@class='selectable']/a");
	public static final By SHOP_ADD_PRICE = By.xpath(".//span[@class='price-sales']");
	public static final By SHOP_ADD_INCREASE = By.xpath(".//button[@class='increase-value']");
	public static final By SHOP_ADD_QUANTITY = By.xpath(".//input[@id='Quantity']");

	public static final By ADD_SHOP = By.xpath("//div[contains(@id,'addshop-submit')]");
	public static final By ADD_SHOP_1 = By.xpath(".//div[@id='addshop-submit-nc']");

	public static final By SHOP_ADD_NOTHANKS_1 = By
			.xpath(".//div[@id='addshop-initial-nc']/div[contains(@class,'addshop-close')]");
	public static final By ADD_TO_CART = By.xpath(".//button[@class='add-to-cart']");
	public static final By ADD_WIN = By.xpath(".//div[@class='addshop-overlay active']");

	// addshop-submit

	// addshop-submit

	// addshop-submit-nc

	// display:block

	// addshop-submit-nc/addshop-overlay

	// addshop-initial-nc/addshop-close

	public AmericanGiantAddtoCart(WebDriver driver) {

		this.driver = driver;
	}

	public Page addtoCart() throws InterruptedException {
		hideAdd();
		driver.findElement(FirstLink).click();
		hideAdd();
		String price = driver.findElement(SHOP_ADD_PRICE).getText();
		System.out.println("price :" + price);

		driver.findElement(SHOP_ADD_SIZE).click();
		Thread.sleep(3000);
		hideAdd();
		driver.findElement(SHOP_ADD_INCREASE).click();
		Thread.sleep(3000);
		hideAdd();
		String quanity = driver.findElement(SHOP_ADD_QUANTITY).getAttribute("value");

		System.out.println("quanity :" + quanity);

		driver.findElement(ADD_TO_CART).click();
		Thread.sleep(3000);
		hideAdd();

		double price_d = Double.valueOf(price.substring(1, price.length() - 1));

		AmericanGiantAddtoCartWindow wind = new AmericanGiantAddtoCartWindow(driver, price_d, Integer.valueOf(quanity));

		return wind;

	}

	public void hideAdd() {
		try {

			JavascriptExecutor executor = (JavascriptExecutor) driver;

			WebElement element = driver.findElement(ADD_WIN);
			System.out.println("Style of Add before " + element.getAttribute("style"));
			executor.executeScript("arguments[0].style.display='none'", element);
			System.out.println("Style of Add After " + element.getAttribute("style"));
		} catch (NoSuchElementException e) {
			System.out.println("Error in Exceute Script" + e.getMessage());
		}

	}

}
