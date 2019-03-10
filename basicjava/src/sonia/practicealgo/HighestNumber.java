package sonia.practicealgo;

class HighestNumber {
	
	
	
	public static int findHighestNumber(int inputArr[]) {
		
		int highestnumb=inputArr[0];
		
		for (int i=0;i<inputArr.length;i++) {
			
			if(highestnumb<inputArr[i] &&inputArr[i]>0) {
				
				highestnumb=inputArr[i];
			}
		}
		
		
		return highestnumb;
		
	}
	
	
	public static int findnextHighestNumber(int inputArr[]) {
		
		int nexthighestnumb=inputArr[0];
	
		
		for (int i=0;i<inputArr.length;i++) {
			
			if(nexthighestnumb<inputArr[i]  && inputArr[i]!=findHighestNumber(inputArr)) {
				
				nexthighestnumb=inputArr[i];
				
			}
		}
		
		
		
		return nexthighestnumb;
	}
	
	
	public static int findnextHighestNumberIndex(int inputArr[]) {
		
		int nexthighestnumb=inputArr[0];
	
		int index=0;
		for (int i=0;i<inputArr.length;i++) {
			
			if(nexthighestnumb<inputArr[i] &&inputArr[i]>0 && inputArr[i]!=findHighestNumber(inputArr)) {
				
				nexthighestnumb=inputArr[i];
				index=i;
			}
		}
		
		
		
		return index;
	}

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr[]= {0,2,4,-3,20,30,55,25,52};
		
		//HighestNumber nameobj= new HighestNumber();
		
		//System.out.println("Highest Number :"+nameobj.findHighestNumber(inputArr));
		System.out.println("Next Highest Number :"+findnextHighestNumber(inputArr));
		System.out.println("Next Highest Number Index:"+findnextHighestNumberIndex(inputArr));	
	
	}
	


}
