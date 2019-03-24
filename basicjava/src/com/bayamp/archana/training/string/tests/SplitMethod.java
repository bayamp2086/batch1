package com.bayamp.archana.training.string.tests;

public class SplitMethod {

	public static void main(String[] args) {
		String s = "Hello to this world";
		String[] words = s.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}

		System.out.println("With Length Example 0");
		String[] words1 = s.split("\\s", 0);
		for (String w : words1) {
			System.out.println(w);
		}
		System.out.println("With Length Example 1");

		for (String w : s.split("\\s", 1)) {
			System.out.println(w);

		}
		System.out.println("With Length Example 2");

		for (String w : s.split("\\s", 2)) {
			System.out.println(w);

		}
		System.out.println("With Length Example 3");

		for (String w : s.split("\\s", 3)) {
			System.out.println(w);

		}

	}
}
