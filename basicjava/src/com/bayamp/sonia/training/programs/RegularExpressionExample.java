package com.bayamp.sonia.training.programs;

public class RegularExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//any characters + Any length
		String pattern=".*";
		pattern="\\{\\w+%";
		
		pattern="^\\w?\\{\\w+\\W{1,3}";
		String name="2{Sonia@@";
		
		//email 6-8 - 3-4 numbers@bayamp.com
		//harish-123@bayamp.com
		//harish@bayamp.com
		//ssn
		
		//pattern="\\w{6,8}-\\w{3,4}\\@\\w+";
		//name="harish-123@bayamp.com";
		
		
		//pattern="\\w{6,8}-\\d{3,4}@bayamp.com";
		pattern="\\w{6,8}\\-?\\d{0,3}@bayamp.com";
		name="harish1@bayamp.com";
		//name=
		
		//password pattern
		//length 6-8 char
		//No special characters
		//Atleast One capital
		//Atleast One Number
		
		//EX Bayamp2
		
		String passwordPattern="\\w{6,8}";
		
		
		
	/*	? at the most one 0 or 1
	 *  + atleast one
	 * \d digit
		\D non Digit [a-zA-Z]
		\w word character[a-z][0-9]
		\\non word character only special character
		\s white space \t\r\n
		\S non white space \w \\w \d \D
		*/
		
		System.out.println(name.matches(pattern));

	}

}
