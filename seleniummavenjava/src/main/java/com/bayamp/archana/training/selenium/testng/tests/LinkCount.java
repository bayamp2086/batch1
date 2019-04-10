package com.bayamp.archana.training.selenium.testng.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkCount  {
	@Test
	public void totalLinksInPage() {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[contains(@type,'submit')]")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for ( WebElement allLink : links) {
			System.out.println(allLink.getAttribute("href"));
		
		}
		driver.close();
	}

}
