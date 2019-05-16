package com.bayamp.archana.training.programs;

import java.util.HashMap;
import java.util.Map;

public class VegAndFruits {

	private Map<String, String> getEatableInMap() {

		Map<String,String>  eatableMap = new HashMap<String, String>();
		eatableMap.put("Orange", "fruits");
		eatableMap.put("Spinach", "Veg");
		eatableMap.put("Apple", "fruits");
		eatableMap.put("Kale", "Veg");

		return eatableMap;	
	}
	public String getEatble(String e) {

		return getEatableInMap().get(e);	
	}
	
}
