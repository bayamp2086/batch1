package com.bayamp.chaya.training.regularexpression;

public class PasswordRegex {
	public static boolean isPasswordValid(String password) {
		String passWordPattern = "^[A-Z][a-z 0-9]{4,6}[!@$%#]$";
		return password.matches(passWordPattern);
	}
	 /* 8 characters
	     1 uppercase
	     1 numeric*/
	public static boolean isNewPasswordValid(String password) {
	String newPasswordPattern =	"^([0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";


	return password.matches(newPasswordPattern);
	}
	
	public static void main(String[] args) {
		String s ="1asaWaaq";
		boolean check = isNewPasswordValid(s);
		System.out.println(check);
	}
}
