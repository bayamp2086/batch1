package com.bayamp.chaya.training.web.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CredoMobilePage {
	private WebDriver driver;
	private static final By SHOP_NOW_LOCATOR = By.linkText("SHOP NOW");
	private static final By ALL_DEVICES_LOCATOR = By.xpath("//a[@class='nav-link'][contains(text(),'All Devices')]");
	private static final By APPLE_DEVICES = By.partialLinkText("Apple");
	private static final By SAMSUNG_DEVICES = By.partialLinkText("Samsung");
	private static final By MOTOROLA_DEVICES = By.partialLinkText("Motorola");
	private static final By ZTE_DEVICES = By.partialLinkText("ZTE");

	public CredoMobilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void CredoMobileCount() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(SHOP_NOW_LOCATOR)).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(ALL_DEVICES_LOCATOR)).click();
		Thread.sleep(2000);
		List<WebElement> appleDeviceList = driver.findElements(APPLE_DEVICES);
		List<WebElement> samsungDeviceList = driver.findElements(SAMSUNG_DEVICES);
		List<WebElement> motorolaDeviceList = driver.findElements(MOTOROLA_DEVICES);
		List<WebElement> zteDeviceList = driver.findElements(ZTE_DEVICES);

		System.out.println("Total No. of Apple Devices: " + appleDeviceList.size());
		System.out.println("Total No. of Samsung Devices: " + samsungDeviceList.size());
		System.out.println("Total No. of Motorola Devices: " + motorolaDeviceList.size());
		System.out.println("Total No. of ZTE Devices: " + zteDeviceList.size());

	}
}
