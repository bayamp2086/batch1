package com.bayamp.akshatha.training.RegExp;

public class RegExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phone1="(408)934-6748";
		String phone2="408876-6749";
		String phone3="(408)abc-6743";
		String phone4="(408)934674";
		
		boolean check=isValidPhone(phone1);
		
		System.out.println(check);
		String email="akshatha9-128@bayamp.com";
		String pattern1="[a-z]{6,8}-?\\d{0,3}@\\w+.com";
		
		System.out.println(email.matches(pattern1));
		
		String ssn="334-55-7854";
		String pattern2="\\d{3}-\\d{2}\\-\\d{4}";
		System.out.println(ssn.matches(pattern2));
		
		String password1="bayamp123";
		String password2="bayamp";
		String password3="Bayamp8";
		
		String passwordPattern="\\w{6,8}";
	}

	private static boolean isValidPhone(String phone) {
		
		String phonePattern="\\(\\d{3}\\)\\d{3}-\\d{4}";
	
		return phone.matches(phonePattern);
	}

}
