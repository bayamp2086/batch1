package com.bayamp.sonia.training.programs;

import java.util.List;

import com.bayamp.sonia.training.utils.ArrayUtil;

public class AppendDuplidatesatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArr[]= {1,3,2,1,6,2,2,2,6,4,4,5};
		
		List<Integer> outputList=ArrayUtil.removeDuplicatebyArrayandappend(inputArr);
		
		System.out.println(outputList);

	}

}
