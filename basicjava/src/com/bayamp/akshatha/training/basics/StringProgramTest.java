package com.bayamp.akshatha.training.basics;

import java.util.Scanner;

public class StringProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(StringUtilityClass.StringLength(s));
		System.out.println(StringUtilityClass.reverse(s));
		System.out.println(StringUtilityClass.isPalindrome(s));
		
		

	}

}
