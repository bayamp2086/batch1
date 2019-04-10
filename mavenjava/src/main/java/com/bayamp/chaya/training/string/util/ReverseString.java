package com.bayamp.chaya.training.string.util;

public class ReverseString {
	
	public static void main(String[] args) {
		 String s="abcdef";
		 int  k=2;
		 char[]sArray = s.toCharArray();
	        String temp="";
	        int z=0;
	        for(int x=s.length(); x>= 0 ;x=x-k){
	        	
	        	for (int i=k-1 ; i>=z ; i--){
		        	//System.out.println("Inside loop 2");
		            temp=temp+sArray[i];
		        }
	        	k=k+2;
	        	z=z+2;
	        	
	        }
		        
	      System.out.println("Temp is "+temp);
	}
	
	
	public static String stringReverse(String word) {
		String str = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			str = str + word.charAt(i);

		}

		//System.out.println(str);
		return str;
	}

}

 class ReverseStringLimit{
	 
	 
	 
	}
	

	