package com.bayamp.archana.training.expression;

public class RegExTest {

	public static void main(String[] args) {
		String phone1 = "(408)806-6887";
		String phone2 = "(408)8066887";
		String phone3 = "(408)abd-6887";
		String email = "rish-123@bayamp.com";
		String name = "Archana";
		String date = "09-02-2019";
		
		boolean check = isValidPhone(phone1);
		System.out.println("The phone no is "+check);
		boolean checkEmail = isValidEmail(email);
		System.out.println("The email is "+checkEmail);
		boolean checkName = isValidEmail(email);
		System.out.println("The name is "+checkName);
		boolean checkDate = isValidDate(date);
		System.out.println("The date is "+checkDate);
	}
	private static boolean isValidEmail(String email) {
		        //. means anythg no letter any charch
				//* means zero or more courrences
				//? means at the most one (0 or 1)
				//+one or more occurences
		String email2 = "^[a-z]{2,6}-?[0-9]{2,6}@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,3}$";
		return email.matches(email2);		
    }
	private static boolean isValidName(String name) {
		String namePattern = "^[a-zA-Z]{2,9}$";
		return name.matches(namePattern);	
    }
	private static boolean isValidPhone(String phone1) {
		String name2 = "\\(\\d{3}\\)\\d{3}-\\d{4}";
		return phone1.matches(name2);
	}
		
	private static boolean isValidDate(String date) {
		String rexDate = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
		return date.matches(rexDate);
		
	}
	
	
}
