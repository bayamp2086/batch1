package com.bayamp.archana.training.string.tests;

public class StringImmutable {

	public static void main(String[] args) {
		String s = "Hello";
		s.concat(" World");// concat() method appends the string at the
									// end

		String s1 = s.concat("World");
		System.out.println(s);// will print World because strings are immutable
		// objects
		System.out.println(s1);
	}

}
