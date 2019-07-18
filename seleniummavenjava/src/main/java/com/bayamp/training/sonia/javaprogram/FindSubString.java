package com.bayamp.training.sonia.javaprogram;

public class FindSubString {

	public static boolean checkStringNew(String inputStr, String checkStr) {

		boolean isStrPresent = false;
		
			if(checkStr==null || checkStr.equals("")) {
				return isStrPresent;
			}
			if(inputStr==null || inputStr.equals("")) {
				return isStrPresent;
			}

			char val = checkStr.charAt(0);
			int m = 0;
			for (int i = 0; i < inputStr.length(); i++) {

				char val1 = inputStr.charAt(i);
				m = i;
				if (val == val1 && m<inputStr.length()-1) {
					String searchString = new String();
					int j = 0;
					while (j < checkStr.length()) {

						char indexVal = inputStr.charAt(m);

						searchString = searchString + indexVal;
						j++;
						m++;
					}

					if (searchString.equals(checkStr)) {
						isStrPresent = true;
						return isStrPresent;
					}
				}else {
					isStrPresent = false;
				}

			}

			return isStrPresent;

	}

	public static void main(String[] args) {

		boolean checkString = checkStringNew("Its a very good day", "ery");
		System.out.println("checkString Present :" + checkString);
	}

}
