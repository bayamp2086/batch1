package com.bayamp.sonia.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bayamp.sonia.training.objects.IPhone;
import com.bayamp.sonia.training.objects.Laptop;
import com.bayamp.sonia.training.objects.programs.ObjectComparator;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String modelNo=new String("6s");
		String ModelColor=new String("Grey");;
		int modelMemory=64;
		double modelPrice=600;
		IPhone ip=new IPhone(modelNo,ModelColor,modelMemory,modelPrice);
		
		modelNo=new String("10x");
		ModelColor=new String("White");;
		modelMemory=200;
		modelPrice=100;
		IPhone ip1=new IPhone(modelNo,ModelColor,modelMemory,modelPrice);
		
		modelNo=new String("11g");
		ModelColor=new String("Black");;
		modelMemory=120;
		modelPrice=1400;
		IPhone ip2=new IPhone(modelNo,ModelColor,modelMemory,modelPrice);
		
		
		
		List<IPhone> iphoneList=new ArrayList<IPhone>();
		
		//adding in List
		iphoneList.add(ip);
		iphoneList.add(ip1);
		iphoneList.add(ip2);
		
		//Retrieving from List
		
		System.out.println("IPhone List :" +iphoneList);
		
		for(IPhone ipl:iphoneList) {
			
			//System.out.println(ipl);
			
		}
		
		Collections.sort(iphoneList, new ObjectComparator("modelPrice"));
		
		System.out.println("IPhone Sort by Comparator by modelPrice" + iphoneList);
		
		System.out.println("**************LapTop Compare ***************8");
	
		Laptop ltp=new Laptop(new String("HP"),modelNo,ModelColor,modelMemory,modelPrice);
		modelNo=new String("10x");
		ModelColor=new String("White");;
		modelMemory=200;
		modelPrice=100;
		Laptop ltp1=new Laptop(new String("Mac"),modelNo,ModelColor,modelMemory,modelPrice);
		modelNo=new String("6s");
		ModelColor=new String("Grey");;
		modelMemory=64;
		modelPrice=600;
		Laptop ltp2=new Laptop(new String("IBM"),modelNo,ModelColor,modelMemory,modelPrice);
		
		
		
		List<Laptop> laptopList=new ArrayList<Laptop>();
		
		//adding in List
		laptopList.add(ltp);
		laptopList.add(ltp1);
		laptopList.add(ltp2);
		
		System.out.println("Laptop List :" +laptopList);
	
		//if Sort by Comparable by price
		Collections.sort(laptopList);
		System.out.println("Laptop Sort by Comparable by Price" +laptopList);
		
		//if Sort by Comparator customizable
		Collections.sort(laptopList, new ObjectComparator("getBrandName"));
		System.out.println("Laptop Sort by Comparator by brandName" +laptopList);
		
		
		
		
	}

}
