package com.bayamp.training.sonia.web.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.web.selenium.pageobject.AmericanGiantAddtoCart;
import com.bayamp.training.sonia.web.selenium.pageobject.AmericanGiantAddtoCartWindow;
import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;

public class AmericanGiantPriceCheck extends BaseTest {

	@Test
	public void checkAddtoCartPrice() throws InterruptedException {

		WebDriver driver = initDriver();
		AmericanGiantAddtoCart addtoCart = new AmericanGiantAddtoCart(driver);
		Page page = addtoCart.addtoCart();
		boolean isAmountValid = false;
		if (page instanceof AmericanGiantAddtoCartWindow) {

			AmericanGiantAddtoCartWindow cartwindow = (AmericanGiantAddtoCartWindow) page;
			isAmountValid = cartwindow.checkPriceOnCartWindow();
		}

		if (isAmountValid) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
