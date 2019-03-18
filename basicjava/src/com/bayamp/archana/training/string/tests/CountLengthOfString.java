package com.bayamp.archana.training.string.tests;

public class CountLengthOfString {
	public String countLength(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			count++;
		}
		System.out.println(count);
		return s;

	}

}
