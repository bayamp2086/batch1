package com.bayamp.chaya.training.string.util;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {
		String email = "test.e.mail+bob.cathy@leetcode.com";
		String []splitEmail;
		Set<String> set = new HashSet<>();
		for(int i=0;i<=emails.length;i++){

			String[] split = email.split("@");
			String text = split[0];
			if (text.contains("+")) {
				String x = text.replaceAll("\\.", "");
				String y = x.replaceAll("\\+.*", "");
				System.out.println(y + "@" + split[1]);


			} else {
				String x = text.replaceAll("\\.", "");
				System.out.println(x + "@" + split[1]);
				String res = x + "@" + split[1];

			}
		}
		return 0;
	}
}
