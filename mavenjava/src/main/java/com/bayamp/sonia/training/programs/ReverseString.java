package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.StringUtility;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inpuString = new String("sonia");

		String reverseString = StringUtility.reverseString(inpuString);

		System.out.println("Reverse String of " + inpuString + " is : " + reverseString);
	}

}
