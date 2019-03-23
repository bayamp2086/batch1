package com.bayamp.archana.training.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayIntoHashMap {
	
	public static void main(String[] args) {
	
	    String[] array ={"apple","banana","apple","berry","berry","apple","Mango"};
		    Map<String,Integer> unsortedFruit = new HashMap<String,Integer>();

		    for(String x:array){

		        if(!unsortedFruit.containsKey(x)){
		        	unsortedFruit.put(x,1);
		        }else{
		        	unsortedFruit.put(x, unsortedFruit.get(x)+1);
		        }
		    }
		    System.out.println("Unsorted Fruit HashMap: "+ unsortedFruit);
		    
		    
		    int[] noArray = {5,4,5,6,7,2,1,1,2,5,2,2}; 
		    Map<Integer,Integer> unsortednoMap = new HashMap<Integer,Integer>();
		    
		    for(Integer n : noArray) {
		    	if(!unsortednoMap.containsKey(n)) {
		    		unsortednoMap.put(n, 1);
		    	}else{
		    		unsortednoMap.put(n, unsortednoMap.get(n)+1 );
		    	}	
		    }
		    System.out.println("Unsorted Number HashMap: "+ unsortednoMap);
		
	}
}
