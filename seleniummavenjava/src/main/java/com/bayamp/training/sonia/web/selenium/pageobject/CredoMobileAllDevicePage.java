package com.bayamp.training.sonia.web.selenium.pageobject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bayamp.web.selenium.common.Page;

public class CredoMobileAllDevicePage extends Page {

	public static final By DEVICE_XPATH = By
			.xpath(".//div[contains(@class,'phone')]//div[@class='border']//div[@class='title']/a");

	WebDriver driver;

	public CredoMobileAllDevicePage(WebDriver driver) {

		this.driver = driver;
	}

	public Map<String, Integer> getAllDeviceCount() {

		List<WebElement> WebElementlist = driver.findElements(DEVICE_XPATH);

		System.out.println("WebElementlist size :" + WebElementlist);

		Map<String, Integer> deviceMap = new HashMap<String, Integer>();

		for (WebElement element : WebElementlist) {
			int deviceCount = 1;
			String elementText = element.getText();
			System.out.println("elementText :" + elementText);
			String mobileArr[] = elementText.split(" ");
			if (mobileArr != null) {

				String PhoneModel = mobileArr[0];
				if (deviceMap.containsKey(PhoneModel)) {

					deviceCount = deviceMap.get(PhoneModel);
					deviceMap.put(PhoneModel, deviceCount + 1);
				} else {
					deviceMap.put(PhoneModel, deviceCount);
				}
			}
		}

		return deviceMap;

	}

}
