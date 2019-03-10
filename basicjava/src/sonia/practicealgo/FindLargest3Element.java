package sonia.practicealgo;

public class FindLargest3Element {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int inputArr[]= {7,4,6,8,10,5,8,12};
		
		
		for (int i=0;i<inputArr.length-1;i++) {
			
			for(int j=i+1;j<inputArr.length;j++) {
			
			if(inputArr[i]>inputArr[j]) {
				
				int firstval=inputArr[j];
				//int secondval=inputArr[j];
				inputArr[j]=inputArr[i];
				inputArr[i]=firstval;
				
				//outArr[j]=inputArr[i+1];
				//outArr[j+1]=inputArr[i];
				
			}
		
			
			}
			
			
		
		}
		
		for (int element :inputArr) {
			
			//System.out.println(element);
			
			
		}
		
		//largest 3 output
		
		System.out.println(inputArr[inputArr.length-1]);
		System.out.println(inputArr[inputArr.length-2]);
		System.out.println(inputArr[inputArr.length-3]);
	}

}
