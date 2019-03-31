package com.bayamp.archana.training.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CountOfCoccurences1 {
	public static void main(String[] args) {
		String s = "aaabbnaaiy";
	
		
	
		 /* 1) Convert the string to an array 
		 * 2) go from 1st char to last charc and place them in right boxes
		 */
		Map<Character , Integer> charMap = new HashMap<Character,Integer>();
		 char[] letter = s.toCharArray();
		 for (char l : letter ) {
			 if (!charMap.containsKey(l)) {
				 charMap.put(l, 1);
			 }else {
			 charMap.put(l, charMap.get(l)+1);
				 
			 }
		 }
		 System.out.println(charMap); 
		 
		 /*
		  * for(
		  * 
		  * 
		  * 
		  */
		 
		 StringBuilder sb = new StringBuilder();
		 
		 for(Map.Entry<Character, Integer> e:charMap.entrySet() ) {
			 sb = sb.append(e.getKey());
			 sb.append(Integer.toString(e.getValue()));
		 }
		 
		 System.out.println(sb.toString());
		 
			 
		 }
	
	
	
	
	
}
