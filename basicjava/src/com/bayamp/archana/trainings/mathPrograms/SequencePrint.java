package com.bayamp.archana.trainings.mathPrograms;

public class SequencePrint {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
