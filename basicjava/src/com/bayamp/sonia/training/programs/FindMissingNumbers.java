package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.NumberUtility;

public class FindMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArr[] = { 4, 6, 7, 8 };
		
		int inputArr1[]={1,2,4,5,6 };

		int missingArr[] = NumberUtility.findMissingNumber(inputArr);

		for (int element : missingArr) {

			if (element != 0) {
				System.out.println("Missing Number in inputArr is :" + element);
			}
		}
		
		missingArr = NumberUtility.findMissingNumber(inputArr1);

		for (int element : missingArr) {

			if (element != 0) {
				System.out.println("Missing Number in inputArr1 is :" + element);
			}
		}

	}

}
