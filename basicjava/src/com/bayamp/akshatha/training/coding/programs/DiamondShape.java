package com.bayamp.akshatha.training.coding.programs;

public class DiamondShape {

	public static void main(String[] args) {
	//To print 2n-1 rows	
		int n=3;
		
		//Printing first half of diamond
        for (int i = 0; i < n; i++) 
        { 
           //print n-i space for each row
            for (int j = 0; j < n-i; j++) 
                System.out.print(" "); 
      
            // Print i*2+1 stars for each row
            for(int j=0;j<=i*2;j++) { 
                System.out.print("*"); 
            }
            System.out.print("\n"); 
           
        
            
        }
        
        //Printing remaining half of diamond
        for (int i = n-1; i > 0; i--) 
        { 
            
            for (int j = 0; j <=n-i; j++) 
                System.out.print(" "); 
      
            // Print i*2-1 stars 
            for(int j=0;j<i*2-1;j++) { 
                System.out.print("*"); 
            }
            System.out.print("\n"); 
                      
        }
	}

}
