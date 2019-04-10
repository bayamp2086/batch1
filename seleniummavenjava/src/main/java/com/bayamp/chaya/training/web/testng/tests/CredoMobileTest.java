package com.bayamp.chaya.training.web.testng.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bayamp.chaya.training.web.pageobjects.CredoMobilePage;
import com.bayamp.web.selenium.common.BaseTest;

public class CredoMobileTest extends BaseTest {
	@Test
	public void credoMobileAllCount() throws InterruptedException{
	WebDriver driver = initDriver();
	CredoMobilePage credoMobile = new CredoMobilePage(driver);
	credoMobile.CredoMobileCount();
}
}
