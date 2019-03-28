package com.bayamp.chaya.training.shapeutils;

public class RightAngle {

	public static void rightAngle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		RightAngle.rightAngle(8);
	}

}
