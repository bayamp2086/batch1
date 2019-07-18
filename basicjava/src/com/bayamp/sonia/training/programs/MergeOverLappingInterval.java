package com.bayamp.sonia.training.programs;

import com.bayamp.sonia.training.utils.ArrayUtil;

public class MergeOverLappingInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputArr[][] = { { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 }, { 8, 10 }, { 9, 11 } };
		int outputarr[][] = ArrayUtil.MergeOverLappingInterval(inputArr);

		for (int i = 0; i < outputarr.length; i++) {
			for (int j = 0; j < outputarr[i].length; j++) {
				System.out.print(outputarr[i][j] + " ");
			}
			System.out.println();
		}
	}

	

}
