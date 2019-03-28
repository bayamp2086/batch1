package sonia.practicealgo;

public class BinarySearchProgram {
	
	//binarysearch is performed in sorted array
	//it reduced complexity of linear search which has (o)n
	//devide array in half and check first half array last element is less than serached element 
	//that means element is prsent in second half.
	
	public static int binarySearch(int arr[],int start,int end,int element) {
		
		int lengthhalf= start+(end-start)/2;
		
		if(arr[lengthhalf]==element) {
			return lengthhalf;
		}
		
		if(arr[lengthhalf]>element) {
			return binarySearch(arr,start,lengthhalf,element);
		}
		return binarySearch(arr,lengthhalf+1,end,element);
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,12,15,21,66,88};
		
		int index=binarySearch(arr,0,arr.length-1,21);
		System.out.println(index);

	}

}
