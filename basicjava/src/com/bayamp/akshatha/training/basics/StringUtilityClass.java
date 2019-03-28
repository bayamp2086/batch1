package com.bayamp.akshatha.training.basics;

public class StringUtilityClass {

	public static boolean isPalindrome(String test) {
		int length = test.length();
		for (int i = 0; i <= (test.length()) / 2; i++)
			if (test.charAt(i) != test.charAt(length - i - 1))
				return false;
		return true;
	}

	public static String reverse(String s) {

		char[] a = s.toCharArray();
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		return String.valueOf(a);

	}

	public static int StringLength(String s) {
		int count = 0;
		for (char a : s.toCharArray()) {
			count++;
		}

		return count;
	}

}
