package com.bayamp.akshatha.training.coding.programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = { 2, 4, 1, 5, 3, 9, 1 };
		bubbleSortNumbers(a);
		System.out.println(Arrays.toString(a));
		
		String s="Sunnyvale";
		String result=bubbleSortString(s);
		System.out.println(result);
		
		
		
	}

	public static String bubbleSortString(String s) {
		
		StringBuilder sb=new StringBuilder(s.toLowerCase());
		for(int i=0;i<sb.length();i++) {
			for(int j=0;j<sb.length()-1-i;j++) {
				if(sb.charAt(j)>sb.charAt(j+1)) {
					char temp=sb.charAt(j);
					sb.setCharAt(j, sb.charAt(j+1));
					sb.setCharAt(j+1, temp);
				}
			}
		}
		return sb.toString();
		
	}

	public static void bubbleSortNumbers(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}

	}

}
