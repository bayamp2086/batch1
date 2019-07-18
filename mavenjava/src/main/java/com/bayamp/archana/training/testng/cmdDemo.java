package com.bayamp.archana.training.testng;

public class cmdDemo {

	public static void main(String[] args) {

		System.out.println("Arg " +args[0]);

	}

	private static final String UserRegx = "^[A-Z][a-z]{4,7}";
	public static boolean UserNameIsValid(String UserName) {
		if (UserName.matches(UserRegx) ){
			System.out.println("UserName is entered");
			return true;
		}
		System.out.println("UserName is not valid");
		return false;
	}


}
