package com.bayamp.chaya.training.driver;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementinSize2NArray {

	public static void main(String[] args) {
		int[] array ={1,1,2,2,2,2};
		int res=NRepeatedElementinSize2NArray.repeatedNTimes(array);
		System.out.println(res);
	}
    public static int repeatedNTimes(int[] A) {
    	 Set<Integer> nums = new HashSet<>();
 		for (int i = 0; i < A.length; i++) {
 			if (nums.contains(A[i]))
 				return A[i];
 			else
 				nums.add(A[i]);
 		}
 		return 0;
     }

}
