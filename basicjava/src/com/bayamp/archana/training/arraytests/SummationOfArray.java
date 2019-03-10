package com.bayamp.archana.training.arraytests;

public class SummationOfArray {
	
	
	
	public static void main(String[] args) {
		int Nos[]= {1,2,3,4,5};
		int sum= Nos[0]+Nos[1]+Nos[2]+Nos[3]+Nos[4];
		// System.out.println(sum);
		SummationOfArray sum1 = new SummationOfArray();
		sum1.summation(Nos);
	}
	
	
	public int summation(int[] arr) {
		 int sum=0;
		for (int i =0; i<arr.length; i++) {
			System.out.println("before " + sum);
			sum = sum + arr[i];
			System.out.println(sum);
		}
		return sum;
		
	
	}
	

}
