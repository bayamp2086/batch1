package com.bayamp.chaya.training.web.testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.bayamp.chaya.training.web.pageobjects.AmazonNthElementPage;
import com.bayamp.web.selenium.common.BaseTest;

public class AmazonNthElementPTest extends BaseTest {

	@Test
	public void seearchElement() throws InterruptedException {
		WebDriver driver = initDriver();
		AmazonNthElementPage element = new AmazonNthElementPage(driver);
		element.search_NthElement("tv");
	}
}
