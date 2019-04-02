package com.bayamp.web.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BayampLoginTest {

	@Test
	public void loginTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://webmail.bayamp.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// csslocator using class attribute
		driver.findElement(By.cssSelector(".field")).sendKeys("user1@bayamp.com");
		// csslocator using id attribute
		driver.findElement(By.cssSelector("#pass")).sendKeys("user1");
		Thread.sleep(2000);
		// csslocator using type attribute
		driver.findElement(By.cssSelector("[type=submit]")).click();
		;
	}
}
