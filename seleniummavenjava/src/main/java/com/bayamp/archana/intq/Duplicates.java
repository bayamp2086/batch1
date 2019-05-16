package com.bayamp.archana.intq;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	
	public static void main(String[] args) {
		int[] input = {3 ,5 ,6 ,4 ,3 ,2 ,1 ,0 ,0};
		Duplicates.printDuplicates1(input);
	}
	
	
	public static void printDuplicates(int[] input) {
		
		/*
		 * 3 5 6 4 3 2 1 0 0
		 * 1 2 1 1 3 3 4 
		 * 
		 * take one element in array and iterate to the rest of the array
		 * 
		 * 
		 * 
		 */
		
		
		for (int i =0; i<input.length; i++) {
			for (int j = i+1; j<input.length; j++) {
				if(input[i] == input[j]) {
					System.out.println(input[i]);
					break;
				}
				
			}
		}
	}
	
	
	static void printDuplicates1(int[] input) {
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int i =0; i < input.length; i++) {
			
			
			int num = input[i];
			if(!intMap.containsKey(num)) {
				intMap.put(num, 1);
			}
			else {
				intMap.put(num, intMap.get(num)+1);
			}	
		}
			
	 System.out.println(intMap);
		
	 
	 for(Map.Entry<Integer, Integer> e: intMap.entrySet()) {
		if( e.getValue() > 1 ) {
			System.out.println("Duplicates are "+ e.getKey() + ": " +e.getValue() );
		}
		 
	 }
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
}
