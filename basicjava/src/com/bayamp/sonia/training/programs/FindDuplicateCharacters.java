package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.StringUtility;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "aaabbbcc";
		String duplicateChar = StringUtility.findDuplicateCharinString(inputString);

		System.out.println("Duplicate Characters in String are " + duplicateChar);
	}

}
