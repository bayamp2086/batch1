package com.bayamp.chaya.training.driver;

public class toLowercase {

	public static void main(String[] args) {
		String s = "oPP";
		toLowerCase(s);
	}

	public static String toLowerCase(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if ((int) charArray[i] >= 65 && (int) charArray[i] <= 90) {
				int ch = (int) charArray[i] + 32;
				charArray[i] = (char) ch;
				System.out.print(charArray[i]);
			} else
				System.out.print(charArray[i] + "");

		}
		String string = String.valueOf(charArray);
		return string;

	}
}
