package com.bayamp.akshatha.training.basics;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] myArray = {5,1,2,3,4,5,1};

         int len = myArray.length;

         for(int i = 0;i<len;i++) {

                 for(int j = i+1;j<len;j++) {

                         if(myArray[i] == myArray[j]) {

                                 myArray[j] = myArray[len-1];
                                 j--;
                                 len--;
                         }


                 }
         }

         int[] newArray = Arrays.copyOf(myArray, len);

         System.out.println(Arrays.toString(newArray));

 



	}

}
