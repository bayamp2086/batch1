package com.bayamp.akshatha.training.RegEx;

public class PasswordValidation {

	/**
	 * Password pattern to check for the following conditions: Contains Alphanumeric
	 * and one special character Length:Min 6 Max 8 Always start with Capital letter
	 * followed by lower-case alphanumeric characters Ends with one special
	 * character from the list:{!@$%#}
	 */
	private static final String PASSWORD_PATTERN_1 = "^[A-Z][a-z0-9]{4,6}[!@$%#]$";

	/**
	 * Password pattern to check for the following conditions: Contains atleast 8
	 * characters Contains atleast 1 uppercase and 1 lowercase characters
	 */
	private static final String PASSWORD_PATTERN_2 = "^(?=.*[A-Z])(?=.*[a-z]).{8,}";

	/**
	 * 
	 * @param password
	 * @return boolean value as true to indicate password matches, else false
	 */
	public static boolean validate1(String password) {
		boolean result = false;
		if (password != null && password.matches(PASSWORD_PATTERN_1)) {
			result = true;
		}
		return result;
	}

	public static boolean validate2(String password) {
		boolean result = false;
		if (password != null && password.matches(PASSWORD_PATTERN_2)) {
			result = true;
		}
		return result;
	}

}
