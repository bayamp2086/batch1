package com.bayamp.training.sonia.web.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class AmericanGiantAddtoCartWindow extends Page {

	public static final By SHOP_ADD_PRICE = By.xpath(
			".//div[@class='reveal-overlay']//div[@id='addtocartconfirmation']//div[@id='ajaxRevealContent']//div[@class='mini-cart-totals']//div[contains(@class,'mini-cart-subtotals')]//span[contains(@class,'value')]");
	// reveal-overlay

	private double price;
	private int quantity;

	public AmericanGiantAddtoCartWindow(WebDriver driver, double price, int quantity) {
		this.driver = driver;
		this.price = price;
		this.quantity = quantity;

	}

	public boolean checkPriceOnCartWindow() {

		String priceVal = driver.findElement(SHOP_ADD_PRICE).getText();

		double price_current_window = 0.0;
		if (priceVal != null) {

			price_current_window = Double.valueOf(priceVal.substring(1, priceVal.length() - 1));
		}

		double price_previous_winodw = price * quantity;

		System.out.println("Price on Current Window : " + price_current_window);
		System.out.println("Price Calculated  :" + price_previous_winodw);

		if (price_current_window == price_previous_winodw) {

			return true;
		}

		return false;
	}

}
