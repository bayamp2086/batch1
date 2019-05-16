package com.bayamp.archana.training.interviewQuestions;

public class ReverseAstring {
	
	public static void main(String[] args) {
		String name = "Archu";
		System.out.println(ReverseAstring.rev(name));
	}

	public static String rev(String s) {
		char[] charNameArr = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for (int i = charNameArr.length-1 ; i>=0 ; i--) {
			sb = sb.append(charNameArr[i]);
		}
		return sb.toString();
	}
}
