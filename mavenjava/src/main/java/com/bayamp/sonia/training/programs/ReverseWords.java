package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.StringUtility;

public class ReverseWords {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputWords=new String("BayAmp Technologies is in Santa Clara");
		String reverseWords=StringUtility.getreverseWords(inputWords);
		System.out.println(reverseWords);
		
		
	}

}
