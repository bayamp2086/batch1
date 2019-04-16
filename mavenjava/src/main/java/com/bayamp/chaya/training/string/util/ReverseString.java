package com.bayamp.chaya.training.string.util;

public class ReverseString {

	public static String stringReverse(String word) {
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);

		}
		return str;
	}
	public static String recursiveStringReverse(String word){
		if(word.length()<2){
			return word;
		}
		return recursiveStringReverse(word.substring(1))+ word.charAt(0);
	}
}
