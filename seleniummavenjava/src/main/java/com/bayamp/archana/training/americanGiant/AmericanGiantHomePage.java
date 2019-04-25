package com.bayamp.archana.training.americanGiant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmericanGiantHomePage {
	public static WebDriver driver;
    static int threadCounter =0;
    static boolean isTestComplete = false;
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

		Actions action = new Actions(driver);
		action.moveToElement(womanElement).build().perform();
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(new Runnable() {
			public void run() {	
				try {
					HandlePopup(driver);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		});
		Thread.sleep(1000);
		WebElement longSleeveElement=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/div/li/div/div/div[3]/ul/li/div/ul/li[1]/a/span"));
		longSleeveElement.click();
		Thread.sleep(10000);
		WebElement stProductElement=driver.findElement(By.xpath("//*[@id=\"63eb01616013feed6e1d9ffae5\"]/div[1]/a/img"));
		stProductElement.click();
		Thread.sleep(10000);
		WebElement pluseElement =driver.findElement(By.xpath("//div[@class='qty']//div//button[@class='increase-value']"));
		pluseElement.click();
		
		Thread.sleep(1000);
		WebElement addToBagElement =driver.findElement(By.xpath("//*[@id=\"dwfrm_product_addtocart_d0myxrvobcvi\"]/div[3]/button"));
		addToBagElement.click();
		
		WebElement viewBagElement =driver.findElement(By.xpath("//*[@id=\"ajaxRevealContent\"]/div[2]/a[2]"));
		viewBagElement.click();
		double salesTax = 8.64;
		double shippingCost = 7.50;
		String estimatedTotal = "$112.14";
		WebElement totalElement = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/div[13]/div[2]/p"));
		String s = totalElement.getText();
		if (estimatedTotal.contains(s)) {
			System.out.println("success");
		}
		
		//This shutdown when you want the listner to stop
		executorService.shutdown();
		isTestComplete = true;
		System.out.println("counter times");

	}	

	public static void HandlePopup(WebDriver driver) throws InterruptedException {
       
		while (isTestComplete == false) {
			threadCounter++;
			System.out.println("PopUp handler starts");
			try {
				WebElement popUpElemnt =driver.findElement(By.xpath("//*[@id=\"addshop-initial-10\"]"));
				
				if (popUpElemnt.isDisplayed()) {
					WebElement noThanksElement = driver.findElement(By.xpath("//*[@id=\"addshop-initial-10\"]/div[4]"));
					noThanksElement.click();
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("The Popup doesnot come up.");
			}
			Thread.sleep(200);
		}
	}
}




