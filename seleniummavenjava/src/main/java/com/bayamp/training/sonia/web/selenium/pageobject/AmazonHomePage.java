package com.bayamp.training.sonia.web.selenium.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bayamp.web.selenium.common.Page;

public class AmazonHomePage extends Page {

	private static final By SEARCHPATH = By.id("twotabsearchtextbox");
	private static final By SearchButton = By.className("nav-input");

	//private static final String path1 = "/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a";
	//private static final By TVLINK1 = By.xpath(path1);
	//private static final By TVLINK5 = By.xpath(
	//		"/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a");

	private static final By TVLINK = By.xpath(".//div[contains(@class,'sg-col-inner')]//div[contains(@class,'a-section')]//h5[contains(@class,'a-color-base')]/a");

	private WebDriver driver;

	public AmazonHomePage(WebDriver driver) {

		this.driver = driver;
	}

	/*
	 * public Page checkPriceofFifthTV(String search) throws InterruptedException {
	 * 
	 * 
	 * 
	 * driver.findElement(SEARCHPATH).sendKeys(search);
	 * driver.findElement(SearchButton).click();
	 * 
	 * WebElement element = driver.findElement(TVLINK5);
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].scrollIntoView()",element);
	 * 
	 * Thread.sleep(2000);
	 * 
	 * System.out.println(element.getAttribute("href"));
	 * 
	 * driver.findElement(TVLINK5).click();
	 * 
	 * 
	 * Actions act=new Actions(driver);
	 * act.moveToElement(element).build().perform();
	 * 
	 * element.click();
	 * 
	 * AmazonSearchPage page= new AmazonSearchPage(driver);
	 * 
	 * return page;
	 * 
	 * }
	 */
	public Page checkpriceofTV(String search, int elementIndex) {

		driver.findElement(SEARCHPATH).sendKeys(search);
		driver.findElement(SearchButton).click();

		List<WebElement> elementList = driver.findElements(TVLINK);
		System.out.println("elementList size :" + elementList.size());

		for (int i = 0; i < elementList.size(); i++) {
			if (i == elementIndex - 1)

			{
				WebElement webElement = elementList.get(i);
				webElement.click();

			}
		}
		// driver.findElement(TVLINK1).click();
		AmazonSearchPage page = new AmazonSearchPage(driver);

		return page;

	}

}
