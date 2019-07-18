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
		outputString = outputString.substring(0, outputString.length() - 1);
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

		while (inputString.length() > 0) {
			int i = 0;
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

	public static boolean checkEmailpattern(String email) {
		/*
		 * ? at the most one 0 or 1 + atleast one \d digit \D non Digit [a-zA-Z] \w word
		 * character[a-z][0-9] \\W non word character only special character \s white
		 * space \t\r\n \S non white space \w \\w \d \D
		 */

		// email 6-8 - 3-4 numbers@bayamp.com
		// harish-123@bayamp.com
		// harish@bayamp.com
		// ssn

		String pattern = "\\w{6,8}\\-?\\d{0,3}@bayamp.com";
		return email.matches(pattern);

	}

	public static boolean checkPasswordpattern(String pwd) {

		// password pattern
		// Alphanumeric and one special characters
		// Length Min 6 max 8
		// Always Starts with one Capital Letter and rest lower alphanumeric
		// Ends with one special characters of this list{!@$%#}

		// Sonia@

		String pattern = "[A-Z][a-z 0-9]{4,6}[!@$%#]";
		return pwd.matches(pattern);

	}

	public static boolean checkPasswordpattern1(String pwd) {

		/*
		 * Your password must have at least:
		 * 
		 * 8 characters 1 uppercase 1 numeric
		 */

		String pattern = "[A-Z a-z 0-9]{8,}";
		return pwd.matches(pattern);

	}

	public static void displayWordbyLetter(String input) {

		char strArr[] = input.toCharArray();
		String finalStr = new String();
		System.out.println("****** Display by Loop ******");
		
		for (int i = 0; i < strArr.length; i++) {

			finalStr = finalStr + strArr[i];
			System.out.println(finalStr);
		}
		finalStr = new String();
		
		System.out.println("****** Display by Loop in Reverse ******");
		
		for (int i = strArr.length - 1; i >= 0; i--) {

			finalStr = finalStr + strArr[i];
			System.out.println(finalStr);

		}
	}

	public static void displayWordbyLetterBySubString(String input) {

		int length = input.length();
		String finalStr = new String();
		int k = 1;
		System.out.println("****** Display by Substring ******");
		
		while (length > 0) {

			finalStr = input.substring(0, k);
			System.out.println(finalStr);
			length--;
			k++;
		}
		length = input.length();
		k = length;
		finalStr = new String();
		System.out.println("****** Display by Substring in Reverse ******");
		while (length > 0) {

			finalStr = finalStr + input.substring(k - 1, k);
			System.out.println(finalStr);
			length--;
			k--;
		}
	}
	
public static void getStringPermutation(String inputStr) {
		
		for(int i=0;i<inputStr.length();i++) {
			
			for(int j=0;j<inputStr.length();j++) {
				
				String str=swapString(i,j,inputStr);
				System.out.println(str);
			}
		}
		
	}
	
	public static String swapString(int c, int c1, String inputStr) {

		char strChar[] = inputStr.toCharArray();

		char temp = strChar[c];
		strChar[c] = strChar[c1];
		strChar[c1] = temp;

		StringBuffer br = new StringBuffer();
		for (int i = 0; i < strChar.length; i++) {

			br.append(strChar[i]);
		}

		return br.toString();

	}

}
