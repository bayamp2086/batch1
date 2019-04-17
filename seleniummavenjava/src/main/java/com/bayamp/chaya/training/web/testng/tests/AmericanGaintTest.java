package com.bayamp.chaya.training.web.testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bayamp.chaya.training.web.pageobjects.AmericanGaintPage;
import com.bayamp.web.selenium.common.BaseTest;

public class AmericanGaintTest extends BaseTest {
	@Test
	public void productPriceValidation() throws InterruptedException {
		WebDriver driver = initDriver();
		AmericanGaintPage page = new AmericanGaintPage(driver);
		page.isTotalValid();
	}

}
