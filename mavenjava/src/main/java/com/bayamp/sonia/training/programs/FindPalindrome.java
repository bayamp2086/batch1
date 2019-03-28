package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.StringUtility;

public class FindPalindrome {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = new String("kanak");
		if (StringUtility.findPalindrome(inputString)) {

			System.out.println(inputString + " is a Palindrome");
		} else {
			System.out.println(inputString + " is a NOT a Palindrome");
		}

	}

}
