package com.bayamp.archana.training.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapProgram {
   static Map<String,Integer> mIntruments = new HashMap<String, Integer>();
   
    public static void main(String[] args ) {
	 mIntruments.put("violin", 10);
	 mIntruments.put("drums", 20);
	 mIntruments.put("piano", 19);
	 
	 System.out.println("To get the value from key :"+ mIntruments.get("violin"));
	 System.out.println("To get the key set :"+ mIntruments.keySet());
	 System.out.println("To check the value present :"+ mIntruments.containsValue(20));
	 System.out.println("To check the key is present :"+ mIntruments.containsKey("piano"));
	 
	 // to sort set is used
	  Set<String> mKeySet= mIntruments.keySet() ;
	  for(String s: mKeySet) {
		  System.out.println("To loop all the keys " +s );
	  }
	  
	//  or this 
	/* for (String s : mIntruments.keySet() ) {
		 System.out.println("To loop all the keys " +s );
	 }*/
	 
	 for (Integer x : mIntruments.values() ) {
		 System.out.println("To loop all the values " +x);
	 }
	 
	 System.out.println("Removed the key violin's value :"+ mIntruments.remove("violin"));
	 
	 Set<Entry<String,Integer> > mEntrySet = mIntruments.entrySet();	
	 for (Map.Entry<String,Integer> enrt : mEntrySet)  {
		 System.out.println("To loop all the Entryset " +enrt);
	 }
 }
}
