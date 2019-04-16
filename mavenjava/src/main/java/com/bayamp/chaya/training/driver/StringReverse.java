package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.string.util.ReverseString;

public class StringReverse {

	public static void main(String[] args) {

		String res = ReverseString.stringReverse("hello123");
		System.out.println(res);
		String res1 = ReverseString.recursiveStringReverse("hello123");
		System.out.println(res1);
	}

}
