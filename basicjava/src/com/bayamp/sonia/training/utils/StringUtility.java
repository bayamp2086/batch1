package com.bayamp.sonia.training.utils;

public class StringUtility {

	public static void sequencePrint() {

		String sequence = new String();
		;

		for (int i = 1; i < 10; i++) {

			if (i < 6) {

				sequence = sequence + i;
				System.out.println(sequence);

			} else {
				sequence = sequence.substring(0, sequence.length() - 1);
				System.out.println(sequence);
			}
		}
	}

	public static String reverseString(String inputString) {

		String reverseString = new String();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			reverseString = reverseString + inputString.charAt(i);

		}

		return reverseString;
	}

	public static boolean findPalindrome(String inputString) {

		String reverse = new String();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			reverse = reverse + inputString.charAt(i);

		}

		if (inputString.equals(reverse)) {

			return true;
		} else {
			return false;
		}
	}

	public static String getreverseWords(String inputWords) {

		inputWords = inputWords.replaceAll(" ", "@");
		String arr[] = inputWords.split("@");

		String outputString = new String();
		for (int i = arr.length - 1; i >= 0; i--) {

			outputString = outputString + arr[i] + " ";

		}
		outputString=outputString.substring(0,outputString.length()-1);
		return outputString;

	}

	public static String getreverseCustomizeWords(String inputWords) {

		inputWords = inputWords.replaceAll(" ", "@");
		String arr[] = inputWords.split("@");

		String outputString = arr[2] + " " + arr[3] + " " + arr[0] + " " + arr[1];

		return outputString;

	}

	public static int findDuplicateChar(String inputString, String s) {

		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {

			if (Character.toString(inputString.charAt(i)).equals(s)) {
				count++;
			}
		}

		return count;

	}

	public static char[] returnDuplicateChar(String inputString) {

		char[] duplicate = new char[inputString.length()];
		int k = 0;
		
		while(inputString.length()>0) {
			int i=0;
			int count = findDuplicateChar(inputString, Character.toString((inputString.charAt(i))));
			if (count > 1) {

				duplicate[k] = inputString.charAt(i);
				inputString = inputString.replaceAll(Character.toString(inputString.charAt(i)), "");
				k++;
			}
			i++;
		}
		return duplicate;

	}

	public static String findDuplicateCharinString(String inputString) {

		String duplicateStrMsg = new String();

		char duplicateArr[] = returnDuplicateChar(inputString);

		for (int i = 0; i < duplicateArr.length; i++) {

			duplicateStrMsg = duplicateStrMsg + duplicateArr[i];
		}

		return duplicateStrMsg;

	}

	public static int getStringLength(String inputString) {

		int strlength = 0;
		int strEnd = 0;

		String s = "";

		while (strlength >= 0 && strEnd == 0) {

			try {
				s = s + inputString.charAt(strlength);
				strlength++;
			} catch (Exception E) {
				strEnd = -1;
			}

		}

		return strlength;

	}

}
