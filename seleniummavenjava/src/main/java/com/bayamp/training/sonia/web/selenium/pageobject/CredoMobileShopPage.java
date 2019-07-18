package com.bayamp.training.sonia.web.selenium.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bayamp.web.selenium.common.Page;

public class CredoMobileShopPage extends Page {

	public static final By SHOPNOW = By.xpath(".//a[contains(@class,'btn-primary')]");
	public static final By ALL_DEVICES = By.xpath(".//div[contains(@class,'col-sm-3')]/a[@class='nav-link']");

	private WebDriver driver;

	public CredoMobileShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public Page shopAllMobile() throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(SHOPNOW);

		// System.out.println(element.getAttribute("href") +" "+element.getText());

		action.moveToElement(element).perform();
	
		
		List<WebElement> elemntList = driver.findElements(ALL_DEVICES);
		System.out.println(elemntList);

		WebElement element1 = elemntList.get(0);

		action.moveToElement(element1);
		
		do {
			Thread.sleep(100);
			} while(!element1.isDisplayed());


		
		action.click();
		action.perform();

		CredoMobileAllDevicePage devicePage = new CredoMobileAllDevicePage(driver);
		return devicePage;

	}

}
