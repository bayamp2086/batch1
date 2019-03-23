package com.bayamp.chaya.training.collections;

public class RegularExpression {

	public static void main(String[] args) {
		String phone1="(669)214-8373";
		String phone2="(669)abc-8373";
		String phone3="(669ab48373";

		String phone4="669-2148373";

		
boolean check = isValidPhone(phone1);
System.out.println(check);
	}
//.=any character
//* anything
	private static boolean isValidPhone(String phone) {
	
		String namePattern = "\\D{6,8}.?\\w{1,6}\\W?\\w{1,3}";

		String name1 = "harish-123@bayamp.com";
		
		return name1.matches(namePattern);
	}

}
//email,harish-123@bayamp.com,harish@bayamp.com,date