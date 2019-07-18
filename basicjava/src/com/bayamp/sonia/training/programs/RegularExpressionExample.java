package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.StringUtility;

public class RegularExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//any characters + Any length
		//String pattern=".*";
		//pattern="\\{\\w+%";
		
		//pattern="^\\w?\\{\\w+\\W{1,3}";
		//String name="2{Sonia@@";
		
		
		
		String email="harish1@bayamp.com";
		
		if(StringUtility.checkEmailpattern(email)) {
			System.out.println("Email is correct");
		}else {
			System.out.println("Email pattern is not correct");
		}
		
		
		
		//password pattern
		//Alphanumeric and one special characters
		//Length Min 6 max 8
		//Always Starts with one Capital Letter and rest lower alphanumeric
		//Ends with one special characters of this list{!@$%#}
		

		String password="A38aa$";
		
		if(StringUtility.checkPasswordpattern(password)) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password pattern is not correct");
		}
		
		
		//another requirement
		
		/*Your password must have at least:

	     8 characters
	     1 uppercase
	     1 numeric*/
		String password1="soniaguptA2SFSF";
		
		if(StringUtility.checkPasswordpattern1(password1)) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password pattern is not correct");
		}
	
		

	}

}
