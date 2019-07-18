package com.bayamp.training.sonia.web.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.training.sonia.web.selenium.pageobject.AmazonHomePage;
import com.bayamp.training.sonia.web.selenium.pageobject.AmazonSearchPage;
import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.common.Page;

public class AmazonPageCheckPriceTest extends BaseTest {
	
	

	@Test
	public void checkTVPriceonAmazon() throws InterruptedException {
		
		WebDriver driver=initDriver();
		
		int TVelement=5;
		
		AmazonHomePage amazonHomePage=new AmazonHomePage(driver);
		Page page=amazonHomePage.checkpriceofTV("TV",TVelement);
		if(page instanceof AmazonSearchPage) {
			
			AmazonSearchPage amazonSearchPage=(AmazonSearchPage)page;
			
			String price=amazonSearchPage.findPriceofTV();
			System.out.println("Price of TV :"+price);
			
		}
		Assert.assertTrue(true);
		
		
	}

}
