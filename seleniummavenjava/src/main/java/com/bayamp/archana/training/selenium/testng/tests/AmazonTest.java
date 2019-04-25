package com.bayamp.archana.training.selenium.testng.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver ;

	@Test
	public void amazonPurchase() {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[contains(@type,'submit')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> allSearch = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']//div[contains(@data-index,'')]//div[@class='a-section aok-relative s-image-fixed-height']"));
		System.out.println("Total no of searchs in the page: "+allSearch.size());

		for(int i =1; i <= allSearch.size(); i++ ) {
			if(i==5) {
				WebElement searchOption5 = driver.findElement(By.xpath("//div[@class='s-result-list sg-row']//div[contains(@data-index,'"+i+"')]//div[@class='a-section aok-relative s-image-fixed-height']"));
				searchOption5.click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("Found the  5 the element");
				String priceOfFifthElement = driver.findElement(By.xpath("//span[@id ='priceblock_ourprice']")).getText();
				System.out.println("The price of the 5th element is: " +priceOfFifthElement);
				//break;
			}	
		}
		//driver.close();
	}



}
