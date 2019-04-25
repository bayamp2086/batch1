package com.bayamp.archana.training.mathPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int firstNo = 12;
		int secondNo = 3;
		int temp;
		System.out.println("Before Swapping:" + "\n" + "First No:" + firstNo + " Second No:" + secondNo);
        temp = firstNo;
        firstNo = secondNo;
        secondNo =temp;
        System.out.println("After Swapping:" + "\n" + "First No:" + firstNo + " Second No:" + secondNo);
        
	}
}
