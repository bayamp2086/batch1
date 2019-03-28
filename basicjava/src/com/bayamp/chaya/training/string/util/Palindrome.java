package com.bayamp.chaya.training.string.util;

public class Palindrome {
	public static String palindromeCheck(String word) {
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);

		}
		if (str.equals(word)) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("Its not palindrome");

		}

		return str;

	}

}
