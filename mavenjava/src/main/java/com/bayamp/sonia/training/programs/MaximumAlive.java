package com.bayamp.sonia.training.programs;

import java.util.HashMap;
import java.util.Map;

public class MaximumAlive {

	int minDate = 10000;
	int maxDate = -1;

	public int findminimumBirthYear(int birthYear[]) {

		for (int i = 0; i < birthYear.length; i++) {

			if (birthYear[i] < minDate) {
				minDate = birthYear[i];
			}

		}
		return minDate;
	}

	public int findmaxDeathYear(int deathYear[]) {

		for (int i = 0; i < deathYear.length; i++) {

			if (deathYear[i] > maxDate) {
				maxDate = deathYear[i];
			}

		}
		return maxDate;
	}

	public int[] getmaximumAlive(int birthYear[], int deathYear[]) {

		int start = findminimumBirthYear(birthYear);
		int end = findmaxDeathYear(deathYear);

		int maxAliveArr[] = new int[2];

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		System.out.println(start + "---" + end);

		for (int i = start; i <= end; i++) {
			int k = 0;
			for (int j = 0; j < birthYear.length; j++) {

				if (i >= birthYear[j] && i <= birthYear[j]) {

					k++;
				}
				if (i == deathYear[j] && k != 0) {
					k--;
				}

			}
			hm.put(i, k);

		}

		//System.out.println(hm.toString());

		Map.Entry<Integer, Integer> firstEntry = hm.entrySet().iterator().next();
		int largestKey = firstEntry.getKey();
		int largestKeyValue = firstEntry.getValue();

		for (Map.Entry<Integer, Integer> map : hm.entrySet()) {

			int largeValue = map.getValue();
			if (largeValue > largestKeyValue) {
				largestKey = map.getKey();
				largestKeyValue = largeValue;
			}
		}

		maxAliveArr[0] = largestKey;
		maxAliveArr[1] = largestKeyValue;

		return maxAliveArr;

	}

}
