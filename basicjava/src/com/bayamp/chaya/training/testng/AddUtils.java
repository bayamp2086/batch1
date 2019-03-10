package com.bayamp.chaya.training.testng;

public class AddUtils {

	public static int addnumbers(int[] inputData) {
		int sum=0;
		for(int ele:inputData){
			sum=sum+ele;
		}
		return sum;
	}

	public static int addtwonumbers(int num1,int num2){
		return num1+num2;
		
	}
}
