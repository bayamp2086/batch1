package sonia.practicealgo;


public class FindHighLowNumb {
	
	
	static int[] findSecondHighNumbAndIndex(int arr[]) {
		
		int high=-1;
		
		int element=-1;
		int index=0;
		int arr1[]= new int[2];
		
		for (int i=0;i<arr.length;i++) {
			
			if(high<arr[i]) {
				
				element=high;
				high=arr[i];
				
				index=i;
				
			}
			else if(arr[i]>element && arr[i]!=high){
				
				element=arr[i];
				index=i;
			}
			
		}
		
		System.out.println(element);
		
		arr1[0]=element;
		arr1[1]=index;
		
		return arr1;
	}
	
static int[] findSecondLowestNumbAndIndex(int arr[]) {
		
		int low=1000;
		
		int element=1000;
		int index=0;
		int arr1[]= new int[2];
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]<low) {
				
				element=low;
				low=arr[i];
				
				index=i;
				
			}
			else if(arr[i]<element && arr[i]!=low){
				
				element=arr[i];
				index=i;
			}
			
		}
		
		System.out.println(low);
		
		arr1[0]=element;
		arr1[1]=index;
		
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,9,25,8,20,40};
		int arr1[]=findSecondHighNumbAndIndex(arr);
		int arr2[]=findSecondLowestNumbAndIndex(arr);
		System.out.println("Second Highest Number is "+arr1[0]+" and Index is "+arr1[1]);
		System.out.println("Second Lowest Number is "+arr2[0]+" and Index is "+arr2[1]);

	}

}
