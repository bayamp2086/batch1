package com.bayamp.web.selenium.common;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

public class propertyFileForLogin {
	private WebDriver driver;
	//private String propertyFile = "src/main/resources/config.properties";
	
	public  WebDriver readPropertiesFile() {
		
		Properties prop = new Properties();

		try {
			FileInputStream input = new FileInputStream("/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/resources/ArcConfig.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browserType"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		String browserType = prop.getProperty("browserType");
		String url = prop.getProperty("app.url");

		if ("firefox".equals(browserType)) {
			System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			driver = new FirefoxDriver();
		}else if ("chrome".equals(browserType)){
			System.setProperty("webdriver.chrome.driver","/Users/mohanakarthikeyan/github-workspace/newbatch1/seleniummavenjava/src/main/resources/drivers/chromedriver/chromedriver2");
			driver = new ChromeDriver();
		}else {
			//System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geco/geckodriver");
			driver = new SafariDriver();
		}
		driver.get(url);
		return driver;
	}
	
	
	@AfterMethod
	protected void closeDriver() throws InterruptedException {
		//driver.close();
		driver.quit();
	}
}
