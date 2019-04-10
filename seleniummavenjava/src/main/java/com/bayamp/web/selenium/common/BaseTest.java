package com.bayamp.web.selenium.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	private WebDriver driver;
	private String propertyFile = "src/main/resources/config.properties";

	protected WebDriver initDriver() {
		
		Properties prop=getProperty();
		String url = prop.getProperty("app.url");
		String browserType = prop.getProperty("browserType");
		String firefoxDriverPath=prop.getProperty("firefoxDriverPath");
		String chromeDriverPath=prop.getProperty("chromeDriverPath");
		
		if("firefox".equals(browserType)) {
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
		}else if("chrome".equals(browserType)){
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterMethod
	protected void closeDriver() throws InterruptedException {
		//driver.close();
		driver.quit();
	}
	
	public Properties getProperty() {
		
		String file = System.getProperty("config");
		
		if(file != null) {
			propertyFile = "src/main/resources/"+file;
		}
		
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(propertyFile);
			prop.load(input);
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return prop;
		
	}

}
