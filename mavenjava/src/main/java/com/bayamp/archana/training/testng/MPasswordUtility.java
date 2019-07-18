package com.bayamp.archana.training.testng;

public class MPasswordUtility {

	private static final String passPattern = "^[A-Z][a-z0-9]{6,6}[@!%#$]{0,1}";


	public static String isCorrectPassword1(String password) {
		if (password == null) throw new RuntimeException("Password cannot be null");
		if(password.matches(passPattern)){
			return "true";
		}
		return "false";
	}
	
	public static boolean isCorrectPassword(String password) {
		if (password == null) throw new RuntimeException("Password cannot be null");
		return password.matches(passPattern);
	}

}
