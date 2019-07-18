package com.bayamp.training.sonia.web.selenium.pageobject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.web.selenium.common.Page;

public class DisclaimerPage extends Page {

	public DisclaimerPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getDisclaimerValue() {

		String value = new String();

		String mainWindow = driver.getWindowHandle();

		Set<String> windowSet = driver.getWindowHandles();

		for (String childWindow : windowSet) {

			if (!mainWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

				value = driver.findElement(By.id("txtname")).getAttribute("value");
				driver.findElement(By.id("btnsubmit")).click();
			}

		}

		driver.switchTo().window(mainWindow);

		return value;
	}

}
