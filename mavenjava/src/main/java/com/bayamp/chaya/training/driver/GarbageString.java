package com.bayamp.chaya.training.driver;

public class GarbageString {

	public static void main(String[] args) {
		twoSum();
		String s = "hgugig65r66k78gf64jjhu3,-5.iok";
		//String s = "ab12cd43ef4";
		s = s.replaceAll("[^0-9-.]", ",");
		System.out.println(s);
		String[] splits = s.split(",");
		for(String str: splits){
			System.out.println(str);
		}
		float total = 0;
		System.out.println(splits.length);
		for (int i = 0; i < splits.length; i++) {
			if(splits[i]!=null && splits[i].length()>0){
				total = total + Float.parseFloat(splits[i]);
			}
		}
		System.out.println(total);
	}
	
	public static void twoSum(){
		int[]arrayInput={0,2,3,4};
		int k=5;
		for (int i = 0; i < arrayInput.length; i++) {
			for (int j = i+1; j < arrayInput.length; j++) {
				if(arrayInput[i]==k-arrayInput[j]){
					System.out.println("i is:"+i+ " j is:"+j);
				}
					
			}
		}
				
		
	}
}



