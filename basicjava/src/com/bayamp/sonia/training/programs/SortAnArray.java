package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;

public class SortAnArray {
	
	/*
	 * input [1,2,0,2,0,3,0,3]
	 * output [0,0,0,1,2,2,3,3]
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArr[]= {1,2,0,2,0,3,0,3};
		int outputArr[]=ArrayUtil.sortArray(inputArr);
		System.out.println(ArrayUtil.toString(outputArr));
	}
	
	
}
