package com.bayamp.chaya.training.string.util;

public class ReverseSentence {

	public static void reverseSen(String sentence) {
		String[] words = sentence.split(" ");
		String rev = "";
		for (int i = words.length - 1; i >= 0; i--) {
			rev += words[i] + " ";
		}
		System.out.println(sentence);
		System.out.println(rev);

	}

}
