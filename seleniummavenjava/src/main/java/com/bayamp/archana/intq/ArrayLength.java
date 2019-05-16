package com.bayamp.archana.intq;

public class ArrayLength {
	static int[] num = new int [100];
	public static void main (String[] args) {
		ArrayLength.Add(4);
		ArrayLength.Add(3);
		ArrayLength.Add(10);
		ArrayLength.Add(8);
		ArrayLength.print();
	}
	public static int Add(int n) {
		int l = getLength();
		num[l]= n;
		return n;
	}
	public static void print() {
		for (int i = 0; i<getLength() ; i++) {
			if (!(num[i]==0)) {
				System.out.println(num[i]);
			}
		}
	}
	public static int getLength() {
		int length = 0;
		for(int i =0; i< num.length; i++) {
			if(!(num[i]== 0)) {
				length++;
			}		
		}
		return length;

	}

}
