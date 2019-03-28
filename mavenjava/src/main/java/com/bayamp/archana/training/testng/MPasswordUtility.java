package com.bayamp.archana.training.testng;

public class MPasswordUtility {
	
private static final String passPattern = "^[A-Z][a-z0-9]{6,6}[@!%#$]{0,1}";

	
	public static boolean isCorrectPassword(String password) {

		
		if (password == null) throw new RuntimeException("Password cannot be null");

		if (password.matches(passPattern)) 
			
		{
			
			System.out.println("Correct password is given");
			
			return true;
		}
		System.out.println("Please give correct password");
		return false;
	}


}
