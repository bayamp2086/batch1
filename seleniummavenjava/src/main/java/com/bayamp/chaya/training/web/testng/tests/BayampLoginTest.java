package com.bayamp.chaya.training.web.testng.tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.chaya.training.web.pageobjects.BayampLoginPage;
import com.bayamp.web.selenium.common.BaseTest;

public class BayampLoginTest extends BaseTest {
	@Test(priority = 0)
	public void bayAmpLoginPositiveTest() {
		WebDriver driver = initDriver();
		BayampLoginPage loginPage = new BayampLoginPage(driver);
		loginPage.bayaAmplogin("user2@bayamp.com", "user2");
		String header_text = loginPage.getLoginHeader();
		System.out.println(header_text);
		Assert.assertTrue(header_text.toLowerCase().contains("logout"));
	}

	@Test(dataProvider = "getMyNegativeDataFromCSV", dataProviderClass = com.bayamp.chaya.training.web.dataprovider.BayampLoginData.class)
	public void bayAmpLoginNegativeTest(Map<String, String> data) {

		WebDriver driver = initDriver();
		BayampLoginPage loginPage = new BayampLoginPage(driver);
		loginPage.bayaAmplogin(data.get("username"), data.get("password"));
		String login_text = loginPage.getLoginStatusMessage();
		String invalidPassword_login_text = loginPage.getInvalidPasswordStatusMessage();
		System.out.println(login_text);
		System.out.println(invalidPassword_login_text);
		if (login_text.contains("You must specify a username to log in"))
			Assert.assertTrue(login_text.toLowerCase().contains("username"));
		else if (invalidPassword_login_text.contains("Log Into Your Account"))
			Assert.assertTrue(invalidPassword_login_text.toLowerCase().contains("account"));
		else
			Assert.assertTrue(login_text.toLowerCase().contains("invalid"));
	}
}
