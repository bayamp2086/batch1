package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class BayampLogin {
	public void myLoginPage() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
		Thread.sleep(2000);

		WebDriver driver = new FirefoxDriver();
		driver.get("http://webmail.bayamp.com");

		driver.manage().window().fullscreen();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#user")).sendKeys("user2@bayamp.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("user2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button")).click();
		Thread.sleep(2000);
		driver.close();
		//driver.quit();

	}
}
