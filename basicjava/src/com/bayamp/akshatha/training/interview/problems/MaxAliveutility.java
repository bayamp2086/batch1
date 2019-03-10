package com.bayamp.akshatha.training.interview.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAliveutility {
	
	private int[][] popStats = null;
	private Map<Integer, Integer> years = null;
	private List<Integer> listOfMaxYears = null;
	private int maxAliveCount = 0;

	public MaxAliveutility(int[][] popStats) {
		
		this.popStats = popStats;
		findAliveCountByYears();
		findMaxAliveCount();
		findMaxAliveYears() ;

	}

	private void findAliveCountByYears() {
		years = new HashMap<Integer, Integer>();

		for (int p = 0; p < popStats.length; p++) {

			for (int y = popStats[p][0]; y <= popStats[p][1]; y++) {

				if (!years.containsKey(y)) {
					years.put(y, 1);
				} else {
					years.put(y, years.get(y) + 1);
				}

			}

		}
	}

	private void findMaxAliveCount() {
		// Iterate over each entry of map using entrySet
		for (Map.Entry<Integer, Integer> entry : years.entrySet()) {
			// Check if value greater than maxAliveCount
			if (entry.getValue() > maxAliveCount) {
				maxAliveCount = entry.getValue();

			}

		}

	}

	private void findMaxAliveYears() {

		
			listOfMaxYears = new ArrayList<>();

			// Iterate over each entry of map using entrySet
			for (Map.Entry<Integer, Integer> entry : years.entrySet()) {
				// Check if value matches with given value
				if (entry.getValue().equals(maxAliveCount)) {
					// Store the key from entry to the list
					listOfMaxYears.add(entry.getKey());
				}
			}
	}

	public List<Integer> getListOfMaxYears() {
		
		return listOfMaxYears;
	}

	public int getMaxAliveCount() {
		return maxAliveCount;
	}

}
