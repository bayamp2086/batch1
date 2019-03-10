package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.arrayutils.BinarySearch;

public class BinarySearchMain {

	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
		int []arr ={10,20,35,50,55,60,65};
		int resultrecursive=bs.recursiveBinarySearch(arr, 0, 6, 60);
		int resultinterative=bs.iterativeBinarySearch(arr, 10);
		if(resultrecursive==-1){
			System.out.println("Element is not present");
		}
		else
			System.out.println("Element is present at index(Recursive method): " +resultrecursive);

	
	if(resultinterative==-1){
		System.out.println("Element is not present");
	}
	else
		System.out.println("Element is present at index(Iterative Method): " +resultinterative);

}


}
