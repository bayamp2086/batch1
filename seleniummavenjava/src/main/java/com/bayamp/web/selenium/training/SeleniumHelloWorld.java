package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumHelloWorld {
	
	@Test
	public void myFirstSeleniumTest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
		Thread.sleep(2000);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*	
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("BayAmp Technologies");*/
		
		//driver.findElement(By.xpath(".//input[contains(@name,'q')]")).sendKeys("BayAmp Technologies");
		
		driver.findElement(By.cssSelector(".gsfi")).sendKeys("BayAmp Technologies");
		
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.close();
	//	driver.quit();
		
		
	}

}
