package com.bayamp.archana.training.mathPrograms;

public class OperationForSpecificNo {

	public static void main(String[] args) {
		int num[] = {1,2,3,4};
		System.out.println("total length"+num.length);
		for (int i=0; i<num.length ; i++) {
			if (i ==3) {
				System.out.println("total length in loop3 == in for loop: " +num[i]);
			}
		}


		//or 

		for (int specNos : num) {

			if (specNos == 3) {
				System.out.println("total length in loop3 == in enchanced for loop: " +specNos);
			}
			if (specNos == 4) {
				System.out.println("total length in loop4 == in enchanced for loop: " +specNos);
			}
		}
	}
}
