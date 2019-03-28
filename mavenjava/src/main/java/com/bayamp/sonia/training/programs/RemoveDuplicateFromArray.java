package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArr[]= {3,3,5,7,3,3,5,7,5};
		
		int outArr[]=ArrayUtil.removeDuplicatebyArray(inputArr);
		
		SystemPrintClass.print(ArrayUtil.toString(outArr));
		
	}

}
