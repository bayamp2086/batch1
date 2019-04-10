package com.bayamp.chaya.training.driver;

import java.util.HashMap;
import java.util.Map;

public class AnagramMapping {

	public static void main(String[] args) {
		int[] aList = { 50, 20, 30, 50, 50 };
		int[] bList = { 50, 30, 50, 20, 50 };

		anagramMappings(aList, bList);
	}
	
	

	public static int[] anagramMappings(int[] A, int[] B) {
		Map<Integer, Integer> lookup = new HashMap();

		for (int i = 0; i < B.length; i++)
			lookup.put(B[i], i);

		int[] ans = new int[A.length];
		for (int j = 0; j < ans.length; j++) {
			ans[j] = lookup.get(A[j]);
		}
		for (int k : ans) {
			System.out.print(k + " ");
		}
		return ans;
	}
}
