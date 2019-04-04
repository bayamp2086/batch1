package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.bayamp.web.selenium.common.BaseTest;
import com.bayamp.web.selenium.pageobjects.LoginPage;

public class SeleniumBayAmpLoginTest extends BaseTest {
	
	
	@Test
	public void checkBayAmpLogin() throws InterruptedException{
		
		WebDriver driver=initDriver();
		
		String expectedEmailAccount = "user3@bayamp.com";
		
		LoginPage loginPage = new LoginPage(driver);
		
		String actualEmail=loginPage.login("user3@bayamp.com", "user3");
		
		driver.findElement(By.xpath(".//input[contains(@id,'user')]")).sendKeys("user3@bayamp.com");
		
		driver.findElement(By.xpath(".//input[contains(@id,'pass')]")).sendKeys("user3");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button")).click();
		
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
		
		
	}

}
