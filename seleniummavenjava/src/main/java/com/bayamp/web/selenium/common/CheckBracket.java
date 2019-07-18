package com.bayamp.web.selenium.common;

import java.util.ArrayList;
import java.util.List;

public class CheckBracket {
	
	
	public static int checkbracket(String str) {
		
		char strArr[]=str.toCharArray();
		
		List <String>paraList=new ArrayList<String>();
		
		for(int i=0;i<strArr.length;i++) {
			
				
				if(strArr[i]=='(') {
					
					paraList.add(String.valueOf(strArr[i]));
				}else if(strArr[i]==')') {
					
					if(paraList.contains("(")) {
					paraList.remove("(");
					}else {
						paraList.add(String.valueOf(strArr[i]));
					}
					
				}
		}
		System.out.println(paraList);
		
		return paraList.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=checkbracket("()))");
		System.out.println(" OutPut " +result);
	}

}
