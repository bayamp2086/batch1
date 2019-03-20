package com.bayamp.akshatha.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapObjectExample {

	public static void main(String[] args) {
		Map<String,BankAccount> map=new HashMap<String,BankAccount>();
		map=initMap();
		
		//Iterating over values only
		System.out.println("Iterating Using only Values");
		for (BankAccount value : map.values()) {
		    System.out.println(value);
		}
		
		System.out.println("Iterating Using For-Each loop and keySet()");
		
		Set<String> keySet=map.keySet();
		
		//Iterate over the keys and then get the value.
		for(String key:keySet) {
			BankAccount bankAccount=map.get(key);
			System.out.println(bankAccount);
		}
		//Iterate using keyset()
		System.out.println("Iterating Using Iterator and keySet()");
		Iterator<String> itr1=keySet.iterator();
		while(itr1.hasNext()) {
			BankAccount bankAccount=map.get(itr1.next());
			System.out.println(bankAccount);
		}
		
		System.out.println("Iterating Using For-Each loop and entrySet()");
		Set<Map.Entry<String,BankAccount>> entrySet=map.entrySet();
		
		for(Map.Entry<String, BankAccount> entry:entrySet){
		//  BankAccount bankAccount=map.get(entry.getKey());
			BankAccount bankAccount=entry.getValue();
			System.out.println(bankAccount);
		}
		
		//Iterate using entrySet()
		System.out.println("Iterating Using Iterator and entrySet()");
		
		Iterator<Map.Entry<String, BankAccount>> itr2=entrySet.iterator();
		
		while(itr2.hasNext()) {
			Map.Entry<String, BankAccount> entry=itr2.next();
			BankAccount bankAccount=entry.getValue();
			System.out.println(bankAccount);
		}
		

	}
	
	public static Map<String,BankAccount> initMap(){
		
		BankAccount b1=new BankAccount("111","John",20000);
		BankAccount b2=new BankAccount("232","Alex",60000);
		BankAccount b3=new BankAccount("775","Mike",90000);
		BankAccount b4=new BankAccount("156","Mary",10000);
		BankAccount b5=new BankAccount("118","Aria",200000);
		
		Map<String,BankAccount> map=new HashMap<String,BankAccount>();
		
		map.put(b1.getAccno(), b1);
		map.put(b2.getAccno(), b2);
		map.put(b3.getAccno(), b3);
		map.put(b4.getAccno(), b4);
		map.put(b5.getAccno(), b5);
		
		
		return map;
		
	}

}
