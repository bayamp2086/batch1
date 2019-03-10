package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class FindFirstHighestNLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArr[] = { 3, 5, 11, 7, 1, 2, 5, 9 };

		int highestNumber = ArrayUtil.findFirstHigestnumber(inputArr);
		int lowestNumber = ArrayUtil.findFirstLowestnumber(inputArr);

		SystemPrintClass.print("First Highest Number : " + highestNumber + "\nFirst Lowest Number :" + lowestNumber);

	}

}
