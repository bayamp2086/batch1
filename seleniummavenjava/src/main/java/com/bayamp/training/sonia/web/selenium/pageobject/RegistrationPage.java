package com.bayamp.training.sonia.web.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.bayamp.web.selenium.common.Page;

public class RegistrationPage extends Page {

	public static final By USER = By.id("ename");
	public static final By EMAIL = By.id("email");
	public static final By PWD = By.id("pwd");
	public static final By CPWD = By.id("cpwd");
	public static final By MONTH = By.id("month");
	public static final By DAY = By.id("day");
	public static final By YEAR = By.id("year");
	public static final By GENDER = By.id("gender");
	public static final By AGREE = By.id("agree");
	public static final By BUTTN_SUBMIT = By.id("btnsubmit");

	// *[@id="ename"]

	public RegistrationPage(WebDriver driver) {

		this.driver = driver;
	}

	public Page getRegistrationName(String user, String email, String pwd, String dob, String gender){

		driver.findElement(USER).sendKeys(user);
		driver.findElement(EMAIL).sendKeys(email);
		driver.findElement(PWD).sendKeys(pwd);
		driver.findElement(CPWD).sendKeys(pwd);

		String date[] = dob.split("/");

		Select selectMonth = new Select(driver.findElement(MONTH));
		selectMonth.selectByValue(date[0]);

		Select selectDay = new Select(driver.findElement(DAY));
		selectDay.selectByValue(date[1]);

		Select selectYear = new Select(driver.findElement(YEAR));
		selectYear.selectByValue(date[2]);

		driver.findElement(GENDER).click();
		driver.findElement(AGREE).click();

		DisclaimerPage disPage = new DisclaimerPage(driver);
		return disPage;
	}
}
