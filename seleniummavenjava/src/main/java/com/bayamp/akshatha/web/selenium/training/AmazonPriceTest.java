package com.bayamp.akshatha.web.selenium.training;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonPriceTest {

	@Test
	public void priceTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// Type 'tv' in search box
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tv");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
	
		//	driver.findElement(By.cssSelector("#priceblock_ourprice_row > .a-span12")).getText();	
		Thread.sleep(2000);
		
		// xpath to get 5th tv and navigate to the page
		driver.findElement(By.xpath("(//div[contains(@class, 's-result-list')]//a[contains(@class, 'a-link-normal a-text-normal')])[5]")).click();
		
		//get product title
		String productTitle=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
				
		//get price 
		String price=driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
		System.out.println("The price for "+productTitle+" is "+ price);
		
		/*
		 * 
		 * List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class, 's-result-list')]//a[contains(@class, 'a-link-normal a-text-normal')]"));
		 * // print the total number of elements
		 * System.out.println("Total selected rows are " + rows.size());
		 * 
		 *  //click on 5th element
		 *  rows.get(5).click();; 
		 * 
		 * Iterator<WebElement> iter = rows.iterator();
		 * 
		 * 
		 * (iter.hasNext()) {
		 * 
		 * Iterate one by one WebElement item = iter.next();
		 * 
		 * // get the text for each element
		 *  
		 *  String label = item.getText();
		 * 
		 * // print the text 
		 * System.out.println("Row label is " + label); }
		 */

	}
}
