package com.bayamp.chaya.training.string.util;

public class ReverseString {
	public static String stringReverse(String word) {
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);

		}

		System.out.println(str);
		return str;
	}

}
	