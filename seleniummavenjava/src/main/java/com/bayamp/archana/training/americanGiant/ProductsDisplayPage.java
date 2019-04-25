package com.bayamp.archana.training.americanGiant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsDisplayPage extends PageofAG {
	
	public ProductsDisplayPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void CheckproductDisplay() {
		WebElement longSleeveElement =driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/div/li/div/div/div[3]/ul/li/div/ul/li[1]/a/span"));
		if(longSleeveElement.isDisplayed()) {
			longSleeveElement.click();
		}
	}
}

