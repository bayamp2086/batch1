package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = { 5, 1, 7, 2, 3, 4, 5, 1, 9, 4 };
		int[] myArraySorted = {2,3,4,5};
		
		int result1[] = removeDuplicates1(myArray);
		int result2[] = removeDuplicates2(myArraySorted);
		
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));

	}

	private static int[] removeDuplicates1(int[] myArray) {
		// TODO Auto-generated method stub
		int len = myArray.length;

		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {

				if (myArray[i] == myArray[j]) {

					myArray[j] = myArray[len - 1];
					j--;
					len--;
				}

			}
		}

		int[] newArray = Arrays.copyOf(myArray, len);
		return newArray;
	}

	//removing duplicates for sorted array with O(n) complexity
	private static int[] removeDuplicates2(int[] a) {
		
		int i=0;
		for(int j=1;j<a.length;j++) {
			if(a[i]==a[j]) {
				continue;
			}else {
				i++;
				a[i]=a[j];
				
				
			}
		}
		int[] newArray = Arrays.copyOf(a, i+1);
		return newArray;

	}

}
