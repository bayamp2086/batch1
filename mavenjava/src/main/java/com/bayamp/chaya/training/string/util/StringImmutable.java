package com.bayamp.chaya.training.string.util;

public class StringImmutable {

	public static void main(String[] args) {
		String s = "Chaya";
		s.concat(" Basavarajaih");// concat() method appends the string at the
									// end

		String s1 = s.concat("Basavarajaiah");
		System.out.println(s);// will print Chaya because strings are immutable
		// objects
		System.out.println(s1);
	}

}
