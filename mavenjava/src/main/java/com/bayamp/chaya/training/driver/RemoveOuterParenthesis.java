package com.bayamp.chaya.training.driver;

public class RemoveOuterParenthesis {

	public static void main(String[] args) {
		String S = "()()";
		String s1=S.replaceAll("\\(", "1");
		String s2=s1.replaceAll("\\)", "-1");
		System.out.println(s2);
		
		}
	}


