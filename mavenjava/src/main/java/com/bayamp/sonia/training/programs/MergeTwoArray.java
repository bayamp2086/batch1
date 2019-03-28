package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;
import com.bayamp.sonia.training.utils.SystemPrintClass;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr1[]= {1,2,3,4};
		int inputArr2[]= {5,6,7};
		
		int outArr[]=ArrayUtil.mergeTwoArray(inputArr1,inputArr2);
		
		for(int element:outArr) {
			
			SystemPrintClass.print(String.valueOf(element));
		}

	}

}
