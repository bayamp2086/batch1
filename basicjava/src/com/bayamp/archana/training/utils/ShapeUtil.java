package com.bayamp.archana.training.utils;

public class ShapeUtil {

	public static void printSquare(int n) {
      int space = n-1;
		for (int i=0; i<n ; i++) {
			for(int k=0; k<space; k++) {
				System.out.print(" ");
			}
				
				space--;
			for (int j=0; j<=i ; j++) {	
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}
	
	/*public static void printDiamond1( int n) {
		//int n = 5;
		for (int i=1; i<=n; i++ ) {
			
			for (int j =1; j<i; j++) {
				System.out.print(j);	
			}
				System.out.println(i);
		}
	}*/
	
	/*public static void printDiamond(int n) {
      //  int n=5;
        int space = n - 1; 
      
        
        for (int i = 0; i < n; i++) 
        { 
            
            for (int j = 0; j < space; j++) 
                System.out.print("-"); 
      
            
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 
		space = 0; 
	      
      
        for (int i = n; i > 0; i--) 
        { 
          
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
          
            for (int j = 0; j < i; j++) a
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
			}	*/


=======
>>>>>>> Stashed changes
	public static void printDiamond(int n) {
		// int n = 3;
		int space = n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.println("");
			}
			for (int j = 0; j < i; j++) {
				System.out.println("*");
				System.out.print("\n");
				space--;
			}
		}
	}

	public static void printHollowDiamond() {
		{
			for (int i = 5; i > -5; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j >= i; j--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}

	}

	public static void printCircle() {

	}

	public static void printHalfDiamond() {

<<<<<<< Updated upstream

	}
}


=======
	}
}
>>>>>>> Stashed changes
