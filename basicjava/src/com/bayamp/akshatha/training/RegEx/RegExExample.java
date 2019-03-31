package com.bayamp.akshatha.training.RegEx;

import java.util.ArrayList;
import java.util.List;

public class RegExExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phone1="(408)934-6748";
		String phone2="408876-6749";
		String phone3="(408)abc-6743";
		String phone4="(408)934674";
		
		
		boolean check=isValidPhone(phone1);
		
		System.out.println("Phone Number Match "+check);
		String email="akshatha-128@bayamp.com";
		String pattern1="[A-Za-z0-9]{6,8}-?\\d{0,3}@\\w+.com";
		
		System.out.println("Email match "+email.matches(pattern1));
		
		String ssn="334-55-7854";
		String pattern2="\\d{3}-\\d{2}\\-\\d{4}";
		System.out.println("SSN Match "+ssn.matches(pattern2));
		
		String password1="bayamp123";
		String password2="bayamp";
		String password3="Bayamp8!";

		
		String pattern="^[A-Z][a-z0-9]{4,6}[!@$%#]$";
		System.out.println("Password Match "+password1.matches(pattern));
		System.out.println("Password Match "+password3.matches(pattern));
	}

	private static boolean isValidPhone(String phone) {
		
		String phonePattern="\\(\\d{3}\\)\\d{3}-\\d{4}";
	
		return phone.matches(phonePattern);
	}

}
