package com.bayamp.training.sonia.web.selenium;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.web.selenium.pageobject.CredoMobileAllDevicePage;
import com.bayamp.training.sonia.web.selenium.pageobject.CredoMobileShopPage;
import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;

public class CredoMobileCountTest extends BaseTest {

	@Test
	public void getMobileCountTest() throws InterruptedException {

		int appleExpectedCount=10;
		int samsungExpectedCount=9;
		int motoExpectedCount=1;
		int zteExpectedCount=1;
		
		WebDriver driver = initDriver();
		CredoMobileShopPage credMobilePage = new CredoMobileShopPage(driver);
		Page page = credMobilePage.shopAllMobile();

		CredoMobileAllDevicePage devicePage = (CredoMobileAllDevicePage) page;
		Map<String, Integer> deviceMap = devicePage.getAllDeviceCount();
		
		//check Apple Count
		
		Assert.assertEquals((int)deviceMap.get("Apple®"),appleExpectedCount);
		
		//check Samsung Count
		
		Assert.assertEquals((int)deviceMap.get("Samsung"),samsungExpectedCount);
		
		//check Moto
		Assert.assertEquals((int)deviceMap.get("Motorola"),motoExpectedCount);
		
		//check ZTE
		Assert.assertEquals((int)deviceMap.get("ZTE"),zteExpectedCount);

		
	}

}
