package com.bayamp.archana.training.string.tests;

public class ReplaceAllString {

	public static void main(String[] args) {
		String s1 = "Amazing";
		String replaceString = s1.replaceAll("a", "e");
		System.out.println(replaceString);
		String s2 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString2 = s2.replaceAll("is", "was");
		System.out.println(replaceString2);

	}

}
