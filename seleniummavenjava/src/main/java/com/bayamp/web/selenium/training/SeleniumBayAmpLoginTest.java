package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumBayAmpLoginTest {
	
	
	@Test
	public void checkBayAmpLogin() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
		Thread.sleep(2000);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webmail.bayamp.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//input[contains(@id,'user')]")).sendKeys("user3@bayamp.com");
		
		driver.findElement(By.xpath(".//input[contains(@id,'pass')]")).sendKeys("user3");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
	}

}
