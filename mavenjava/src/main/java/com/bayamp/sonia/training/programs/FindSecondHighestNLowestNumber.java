package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class FindSecondHighestNLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArr[] = { 2, 6, 4, 8, 3, 7, 9 };
		int secondHighNub = ArrayUtil.findSecondHigestnumber(inputArr);
		int secondLowNub = ArrayUtil.findSecondLowestnumber(inputArr);
		SystemPrintClass.print("Second Highest Number : " + secondHighNub + "\nSecond Lowest Number :" + secondLowNub);
	}

}
