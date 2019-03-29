package com.bayamp.chaya.training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.chaya.training.regularexpression.PasswordRegex;

public class PasswordRegexTestNG {

	@Test(priority = 0, dataProvider = "positivePasswordCheck", dataProviderClass = com.bayamp.chaya.training.dataproviderutility.PasswordRegexDataProvider.class)
	public void positivePasswordValidation(String passwordData, boolean expected) {
		System.out.println(passwordData + ": " + expected);
		Assert.assertEquals(expected, PasswordRegex.isPasswordValid(passwordData));
	}

	@Test(priority = 1, dataProvider = "negativePasswordCheck", dataProviderClass = com.bayamp.chaya.training.dataproviderutility.PasswordRegexDataProvider.class)
	public void negativePasswordValidation(String passwordData, boolean expected) {
		boolean actualResult = PasswordRegex.isPasswordValid(passwordData);
		System.out.println(passwordData + ": " + expected);
		Assert.assertEquals(expected, actualResult);
	}
}
