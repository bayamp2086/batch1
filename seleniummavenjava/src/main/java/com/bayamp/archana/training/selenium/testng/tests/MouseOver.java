package com.bayamp.archana.training.selenium.testng.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseOver {

public static WebDriver driver;

public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
     driver = new FirefoxDriver();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("http://www.credomobile.com");

     WebElement element = driver.findElement(By.linkText("SHOP NOW"));

     Actions action = new Actions(driver);

     action.moveToElement(element).build().perform();

     driver.findElement(By.linkText("SHOP NOW")).click();
     
     List<WebElement> allPhoneElements = driver.findElements(By.xpath("//div  vy'/a"));
     int appleCtr =0;
     int samsungCtr =0;
     int motoCtr =0;
     int zteCtr =0;
     int otherMob =0;
     
     for ( WebElement phoneElement: allPhoneElements) {
    	String phoneBrand = phoneElement.getText().trim();
    	System.out.println("Phone brand text "+ phoneBrand );
    	if (phoneBrand.contains("Apple")) appleCtr = appleCtr + 1; 
    	else if (phoneBrand.contains("Samsung"))  samsungCtr++;
    	else if (phoneBrand.contains("Moto"))motoCtr= motoCtr + 1;
    	else if (phoneBrand.contains("ZTE"))zteCtr= zteCtr + 1;
    	else otherMob++;	
     }
      System.out.println("Total Apple Phone: "+ appleCtr);
      System.out.println("Total Samsung Phone:"+ samsungCtr);
      System.out.println("Total moto phone "+ motoCtr);
      System.out.println("Total zte phone "+ zteCtr); 
     }


}
