package com.bayamp.archana.training.selenium.testng.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RowAndColumnCount {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geco/geckodriver");
	WebDriver driver=new FirefoxDriver();

	driver.manage().window().maximize();

	driver.get("https://money.rediff.com/gainers");
	List<WebElement> rows =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("Total no of rows in the table are "+rows.size());
	
	/*List<WebElement> column =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
	System.out.println("Total no of columns multiplied by no of rows in the table are "+column.size());
	*/
	List<WebElement> columnOfFirstRow =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
	System.out.println("Total no of columns of the first row  in the table are "+columnOfFirstRow.size());
	
	}
	

}
