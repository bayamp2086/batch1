package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BayampLogin {
	public void myLoginPage() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
		Thread.sleep(2000);
		
		String expectedEmailAccount = "user2@bayamp.com";

		WebDriver driver = new FirefoxDriver();
		driver.get("http://webmail.bayamp.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#user")).sendKeys("user2@bayamp.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("user2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button")).click();
		
		String emailAccount = driver.findElement(By.id("lblUserNameTxt")).getText();
		System.out.println("The email account on the landing page is :"+emailAccount);
		
		Assert.assertEquals(emailAccount, expectedEmailAccount);
		Thread.sleep(2000);
		driver.close();
		//driver.quit();

	}
}
