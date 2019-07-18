package com.bayamp.chaya.training.dataproviderutility;

import org.testng.annotations.DataProvider;

public class PasswordRegexDataProvider {
	@DataProvider(name= "positivePasswordCheck")
	public static Object[][] positivePassWordRegexData(){
		boolean expected = true;
		String password1="Aqa11w$";
		String password2="B1wab12#";
		String password3="Zqa11!";
		String password4="Aq1111w@";
		String password5="Aaa11w%";

		Object[][] myPasswordData ={{password1,expected},{password2,expected},{password3,expected},{password4,expected},{password5,expected}};
		return myPasswordData;
		
	}
	@DataProvider(name = "negativePasswordCheck")
	public static Object[][] negativePassWordRegexData(){
		boolean expected = false;
		String password1="AAqa11w$";
		String password2="B1wab12";
		String password3="Z$qa1a1!";
		String password4="1q1111wee@";
		String password5="aa11w%@";

		Object[][] myPasswordData ={{password1,expected},{password2,expected},{password3,expected},{password4,expected},{password5,expected}};
		return myPasswordData;
		
	}


}
