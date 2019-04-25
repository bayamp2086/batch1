package com.bayamp.archana.training.mathPrograms;

public class SwapWithoutTemp {
	
	public static void main(String[] args) {
		int firstNo = 10;
		int secondNo =5;
		System.out.println("Before Swapping:" + "\n" + "First No:" + firstNo + " Second No:" + secondNo);
		secondNo = firstNo + secondNo;
		firstNo = secondNo - firstNo;
		secondNo = secondNo - firstNo;
		System.out.println("After Swapping:" + "\n" + "First No:" + firstNo + " Second No:" + secondNo);
	        
	}

}
