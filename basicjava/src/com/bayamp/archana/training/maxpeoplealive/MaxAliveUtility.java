package com.bayamp.archana.training.maxpeoplealive;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxAliveUtility {

	int birthYear;
	int deathYear;

	public MaxAliveUtility(int bYear, int dYear) {
		this.birthYear = bYear;
	    this.deathYear = dYear;
	}
	
	
	public static int getMaxYear(List<MaxAliveUtility> people){
		Map<Integer, Integer> years = new TreeMap<Integer, Integer>();
		
		for(MaxAliveUtility temp : people) {
			if (!years.containsKey(temp.birthYear)) {
				years.put(temp.birthYear, 0);
			}
			years.put(temp.birthYear, years.get(temp.birthYear) + 1);

            if (!years.containsKey(temp.deathYear + 1))
            {
                years.put(temp.deathYear + 1, 0);
            }
            years.put(temp.deathYear + 1, years.get(temp.deathYear + 1) - 1);
        }

		
	int maxYear = 0, max = Integer.MIN_VALUE, current = 0;

    for (Map.Entry<Integer, Integer> entry : years.entrySet())
    {
        int year = entry.getKey();
        int delta = entry.getValue();
        current += delta;
        if (current > max)
        {
            maxYear = year;
            max = current;
        }
    }

    return maxYear;
}
	
	void getMaxAliveCount(){
		
	}
}
