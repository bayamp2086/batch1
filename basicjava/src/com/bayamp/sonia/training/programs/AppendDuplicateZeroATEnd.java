package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class AppendDuplicateZeroATEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr1[]= {1,0,5,7,2,8,0};
		int outArr1[]=ArrayUtil.appendzeroatEnd(inputArr1);
		SystemPrintClass.print(ArrayUtil.toString(outArr1));
				

	}

}
