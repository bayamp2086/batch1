package sonia.practicealgo;

public class BubbleSortProgram {
	
	public static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Sorted Array :"+arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,65,8,12,55,6};
		bubbleSort(arr);
	}

}
