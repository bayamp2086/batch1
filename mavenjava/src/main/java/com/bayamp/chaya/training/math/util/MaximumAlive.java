package com.bayamp.chaya.training.math.util;

import java.util.Arrays;

public class MaximumAlive {

	public static void aliveCount(int birth[], int death[]) {
		int i = 0;
		int j = 0;

		Arrays.sort(birth);
		Arrays.sort(death);
		int max_length = birth.length + death.length;
		int total_count = 0;
		int year = 0;
		int maxVal = 0;

		for (int k = 0; k < max_length; k++) {
			if (i < birth.length && birth[i] <= death[j]) {
				total_count++;
				// System.out.println("Year is "+ total_count + " Birth: "+
				// birth[i]);
				if (total_count > maxVal) {
					maxVal = total_count;
					year = birth[i];
				}
				i++;
			} else if (j < death.length) {
				total_count--;
				// System.out.println("Year is "+ total_count + " Death: "+
				// death[j]);
				if (total_count > maxVal) {
					maxVal = total_count;
					year = death[j];
				}
				j++;
			}

		}

		System.out.println("Max People:" + maxVal);
		System.out.println("Year:" + year);

	}

}
