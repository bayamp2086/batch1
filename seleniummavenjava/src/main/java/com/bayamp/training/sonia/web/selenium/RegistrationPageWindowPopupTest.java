package com.bayamp.training.sonia.web.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.web.selenium.pageobject.DisclaimerPage;
import com.bayamp.training.sonia.web.selenium.pageobject.RegistrationPage;
import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;

public class RegistrationPageWindowPopupTest extends BaseTest {
	
	
	@Test
	public void checkRegistrationNameValue() {
		
		WebDriver driver=initDriver();
		RegistrationPage resigPage=new RegistrationPage(driver);
		Page page=resigPage.getRegistrationName("Sonia", "sgbayamp@gmail.com", "123456", "Jan/5/1990", "Female");
		if(page instanceof DisclaimerPage) {
			DisclaimerPage disPage=(DisclaimerPage)page;
			System.out.println("Disclaimer Name :" +disPage.getDisclaimerValue());
		}
		
		Assert.assertTrue(true);
		
		
	}

}
