package com.bayamp.archana.trainings.mathPrograms;

public class PrintDiamond {

	public int diamondShape(int n) {
		
		int space = n-1;
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<space ; j++) {
				System.out.println("*");
			}
		}
			
		return 0;
		
	}
}
