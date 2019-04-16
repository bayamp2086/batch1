package com.bayamp.archana.training.selenium.testng.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmericanGiant {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver/chromedriver2");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.american-giant.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		/*
		 * 
		 * this is  a new thread that runs the handlePopup when it comes up. 
		 * 
		 */
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {
		    public void run() {
		    	try {
					HandlePopup(driver);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
		    }
		});
		
		Thread.sleep(10000);
		System.out.println("Test Completed");
		
		 WebElement womanElement = driver.findElement(By.cssSelector("ul.nav-list--categories:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
		//*[@id="main-menu-navigation"]/li[3]/a
		// #main-menu-navigation > li:nth-child(3) > a
		//*[@id="main-menu-navigation"]/li[3]/a

	     Actions action = new Actions(driver);

	     action.moveToElement(womanElement).build().perform();
	     WebElement longSleeveElement =  driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/div/li/div/div/div[3]/ul/li/div/ul/li[1]/a/span"));
	     longSleeveElement.click();
	     WebElement addToBagElement =driver.findElement(By.xpath("//div[@class='product-name']/a[@title=\"Go to Product: Premium V-Neck T Long Sleeve\"]"));
	     addToBagElement.click();
	
	     // use this shutdown when you want the listner to stop
		//executorService.shutdown();
		
	}	

	public static void HandlePopup(WebDriver driver) throws InterruptedException {
       
		while (true) {
			System.out.println("IN side the handler");
			try {
				WebElement elemnt =driver.findElement(By.xpath("/html/body/div[18]/div/div/div/div/form/input[7]"));
				//System.out.println(elemnt.getSize());
				Thread.sleep(1000);

				if (elemnt.isDisplayed()) {
					driver.findElement(By.xpath("/html/body/div[18]/div/div/div/div/div[4]")).click();
				}
			}
			catch(NoSuchElementException  e) {
				System.out.println("THe Popup doesnot come up.");

			}
			Thread.sleep(200);
		}

	}

}




