package com.bayamp.akshatha.training.Utils;

public class ArrayUtils {

	
	public static int [] removeDuplicates(int [] myArray) {
		int len=myArray.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len-1; j++) {
				if(myArray[i] == myArray[j]) {
					myArray[j]=myArray[len-1];
					len--;
				}
				
			}
		}
		return null;
	}
}
