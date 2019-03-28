package com.bayamp.hellopackage;

public class Printdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int number = 5; //3
			int levelCount = number/2; //3
			int spaceCount = levelCount;
			
			int starCount = 1;
			
			for(int i = 0;i < levelCount ;i++) {
				
				//Start Level 1
				for(int j = 0;j < spaceCount;j++) {
					System.out.print(" ");
				}
				
				for(int j = 0;j < starCount;j++) {
					System.out.print("*");
				}
				//End Level 1
				System.out.println("");
				
				starCount = starCount + 2;
				spaceCount--;
				
			}
			
			for(int i = 0;i<number;i++){
				System.out.print("*");
			}
			System.out.println(" ");
			
			// for five level its  levelCount+1;	
			// for seven level its  levelCount+2;
			// for nine level its  levelCount+3;	
			starCount = levelCount+1;	 
			spaceCount = 1;
			
			for(int i = 0;i < levelCount ;i++) {
				for(int j = 0;j < spaceCount;j++) {
					System.out.print(" ");
				}
				
				for(int j = 0;j < starCount;j++) {
					System.out.print("*");
				}
				//End Level 1
				System.out.println("");
				starCount = starCount - 2;
				spaceCount++;
				
			}

	}

}
