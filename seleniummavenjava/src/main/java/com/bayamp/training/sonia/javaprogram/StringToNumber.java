package com.bayamp.training.sonia.javaprogram;

import java.util.ArrayList;
import java.util.List;

public class StringToNumber {
	 
    public static int convert2Number(String numStr){
         
    	if(numStr==null) {
        	return -1;
        }
    	
        char ch[] = numStr.toCharArray();
        List<Integer> asciiList=new ArrayList<Integer>();
       // Adding ascii value of 0-9;
        asciiList.add(48);
        asciiList.add(49);
        asciiList.add(50);
        asciiList.add(51);
        asciiList.add(52);
        asciiList.add(53);
        asciiList.add(54);
        asciiList.add(55);
        asciiList.add(56);
        asciiList.add(57);
        
        
        
        int sum = 0;
        //get ascii value for zero
        List<Integer>checkNum=new ArrayList<Integer>();
        int zeroAscii = (int)'0';
        boolean dontAddStr=false;
        for(char c:ch){
            int tmpAscii = (int)c;
            if(asciiList.contains(tmpAscii) && sum>=0 && !dontAddStr) {
            	sum = (sum*10)+(tmpAscii-zeroAscii);
            	checkNum.add(sum);
            }
            else if(!asciiList.contains(tmpAscii) && sum>0) {
            	dontAddStr=true;
            }
           else if(sum==0 && checkNum.size()==0 && !asciiList.contains(tmpAscii)){
            	sum=-1;
            }
        } 
        return sum;
    }
     
    public static void main(String a[]){
         
       // System.out.println("\"3256\" == "+convert2Number("3256"));
       // System.out.println("\"0123456789\" == "+convert2Number("0123456789"));
        System.out.println("\"477\" == "+convert2Number("477"));
        System.out.println("\"603abc\" == "+convert2Number("603abc"));
        System.out.println("\"abc2086\" == "+convert2Number("abc2086"));
        System.out.println("\"457a224\" == "+convert2Number("457a224"));
        System.out.println("\"null\" == "+convert2Number(null));
        System.out.println("\"1234Sonia1234\" == "+convert2Number("1234Sonia1234"));
       // System.out.println("\"603abc\" == "+convert2Number("603abc"));
    }
}