package com.bayamp.archana.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaLoginUtil {
	public static boolean Login() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
		Thread.sleep(2000);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webmail.bayamp.com/");
		driver.findElement(By.id("user")).sendKeys("user4@bayamp.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("user4");
		driver.findElement(By.cssSelector(".button")).click();
		Thread.sleep(2000);
		boolean LogoutImage = driver.findElement(By.id("lblLogout")).isDisplayed();
		if (LogoutImage) {
			System.out.println("The page has signned in succefully and navigated to the inbox page");
		} else {
			System.out.println("The page failed to sign in");
		}
		
		return LogoutImage;
	}
	
	/*System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
	Thread.sleep(2000);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://webmail.bayamp.com/");
	driver.findElement(By.id("user")).sendKeys("user4@bayamp.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("user");
	driver.findElement(By.cssSelector(".button")).click();
	Thread.sleep(2000);
	if (driver.findElement(By.id("lblLogout")).isDisplayed()) {
		System.out.println("The page has signned in and navigated to the inbox page");
	} else {
		System.out.println("The page failed to sign in");
	}*/
}
