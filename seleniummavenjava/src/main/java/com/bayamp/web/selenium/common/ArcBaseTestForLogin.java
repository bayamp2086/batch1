package com.bayamp.web.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ArcBaseTestForLogin {
	
	//All locators 
	private WebDriver driver;
	

	public static void urlAndVersionDependz() {

		Object browserType = null;
		WebDriver driver= new InternetExplorerDriver();
		WebDriver driver2= new FirefoxDriver();
		WebDriver driver3= new FirefoxDriver();
		if ("firefox".equals(driver)) {
			System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			driver = new InternetExplorerDriver();
		}else if ("chrome".equals(driver2)){
			System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			driver = new FirefoxDriver();
		}
	}
}
