package com.bayamp.sonia.training.utils;

public class ShapeUtil {

	public static void printDiamond(int count) {

		int half = count / 2;
		int counthalf = half;
		String daimondStars = new String();
		for (int i = 0; i < count; i++) {
			daimondStars = daimondStars + "0";
		}

		while (count > 1) {

			String replace = new String();
			String replaceby = new String();
			for (int i = 1; i < half; i++) {
				replace = replace + "0";
				replaceby = replaceby + " ";
			}

			String daimondStars1 = daimondStars.replaceFirst(replace, replaceby);
			daimondStars1 = daimondStars1.substring(0, daimondStars.length() - half) + replaceby;

			System.out.println(daimondStars1);

			count--;

			if (count <= counthalf) {
				half++;
			} else {
				half--;
			}
		}

	}

}
