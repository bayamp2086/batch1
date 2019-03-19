package com.bayamp.chaya.training.shapeutils;

public class DiamondShapePrint {

	public static void shape(int n) {
		int mid= (n+1)/2;
		for (int i = 1; i <=mid; i++) {
			for(int space=1;space<=mid-i;space++){
				System.out.print(" ");
			}
			for(int star=1;star<=(i*2)-1;star++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 1; i <=mid-1; i++) {
			for(int space=1;space<=i;space++){
				System.out.print(" ");
			}
			for(int star=1;star<=2*(mid-i)-1;star++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String args[]) {
		DiamondShapePrint.shape(9);

	}
}