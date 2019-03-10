package sonia.practicealgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumAlive {

	int min = 10000;
	int murder = -1;

	public int findminimumBirthDate(int birthDate[]) {

		for (int i = 0; i < birthDate.length; i++) {

			if (birthDate[i] < min) {
				min = birthDate[i];
			}

		}
		return min;
	}

	public int findmaxMurderDate(int murderDate[]) {

		for (int i = 0; i < murderDate.length; i++) {

			if (murderDate[i] > murder) {
				murder = murderDate[i];
			}

		}
		return murder;
	}
	
	//public int[][]maximumAlive(int popStatic[][]){
		
		
	//}

	public static void main(String[] args) {

		int birthDate[] = { 1990, 2000, 2010 };
		int murderDate[] = { 2030, 2010, 2020 };

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		MaximumAlive obj = new MaximumAlive();
		int start = obj.findminimumBirthDate(birthDate);
		int end = obj.findmaxMurderDate(murderDate);

		System.out.println(start + "---" + end);

		for (int i = start; i <= end; i++) {
			int k = 0;
			for (int j = 0; j < birthDate.length; j++) {

				if (i >= birthDate[j] && i <= murderDate[j]) {

					k++;
				}
				if (i == murderDate[j] && k != 0) {
					k--;
				}

			}
			hm.put(i, k);
			System.out.println("In Year " + i + " Alive Person are" + k);

		}

		System.out.println(hm.toString());

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
		System.out.println(" Year of maximum Alive      : " + largestKey);
		System.out.println("No of Died : " + largestKeyValue);
	}

}
