package com.bayamp.chaya.training.shapeutils;

public class Triangle {
	public static void triangle(int n) {
		int mid = (n + 1) / 2;
		for (int i = 1; i <= mid; i++) {
			for (int space = 1; space <= mid - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Triangle.triangle(9);
	}

}
