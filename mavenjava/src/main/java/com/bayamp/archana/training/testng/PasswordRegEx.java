package com.bayamp.archana.training.testng;

public class PasswordRegEx {

	public static void main(String[] args) {
		
		String pattern = "(^[A-Z][a-z]{4,6})";
		String myStr = "Archu";
		
		System.out.println(myStr.matches(pattern));
		
	}

}
