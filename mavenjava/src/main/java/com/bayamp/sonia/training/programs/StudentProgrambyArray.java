package com.bayamp.sonia.training.programs;

public class StudentProgrambyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] student= {"Sonia","Gupta","12"};
		String [] student1= {"Chaya","M","345"};
		
		System.out.println("Chaya Marks"+student1[2]);
		
		String [][] studentAll={ {"Sonia","Gupta","12"} ,{"Chaya","M","345"}};
		
		System.out.println("Chaya Marks"+studentAll[1][2]);

	}

}
