package sonia.practicealgo;

public class MostOccuranceNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int inputArr[]= {7,8,6,8,10,5,8,8,4,6};
		
		for(int i=0;i<inputArr.length;i++) {
			int k=1;
			for(int j=i+1;j<inputArr.length;j++) {
				
				if(inputArr[i]==inputArr[j]) {
					
					k++;
				}
			}
			System.out.println("Value of " +inputArr[i]+"Comes "+k +"times");
		}

	}

}
