package com.bayamp.web.selenium.training;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BayampEmail {
	
	private static final By ID_LOCATOR = By.id("user");

		@Test
		public void myFirstSeleniumTest() throws InterruptedException{
			
			System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			Thread.sleep(2000);
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://webmail.bayamp.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			//driver.findElement(By.xpath(".//input[contains(@name,'q')]")).sendKeys("BayAmp Technologies");
			
			driver.findElement(ID_LOCATOR).sendKeys("user4@bayamp.com");
			
			Thread.sleep(1000);
			driver.findElement(By.id("pass")).sendKeys("user4");
			driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
//			driver.close();
//			driver.quit();
			
			
		}

	}


