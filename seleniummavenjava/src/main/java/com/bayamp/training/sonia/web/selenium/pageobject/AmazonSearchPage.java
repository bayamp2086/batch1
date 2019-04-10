package com.bayamp.training.sonia.web.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class AmazonSearchPage extends Page {
	
	private static final By PRICE=By.xpath("//span[contains(@id,'priceblock_ourprice')]");
	
	
	public AmazonSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String findPriceofTV(){
		
		return driver.findElement(PRICE).getText();
	}
		

}
