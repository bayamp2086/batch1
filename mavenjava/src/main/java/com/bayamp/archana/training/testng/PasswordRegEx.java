package com.bayamp.archana.training.testng;

public class PasswordRegEx {

	public static void main(String[] args) {
		
		String pattern = "(^[A-Z]{1}[a-z0-9]{4,6}(!|@|$|%|#){1})";
		String myStr = "Abcde12!";
		
		System.out.println(myStr.matches(pattern));
		
	}

}
