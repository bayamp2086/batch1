package com.bayamp.archana.training.string.tests;

public class AddNosInTheString {
	
	public AddNosInTheString(String s1,int n1,String s2,int n2) {
		String x = String.valueOf(n1);
		String y = String.valueOf(n2);
		String z = s1+x+y+n2;
		System.out.println("Adding numbers to string: "+z);
	}

}
