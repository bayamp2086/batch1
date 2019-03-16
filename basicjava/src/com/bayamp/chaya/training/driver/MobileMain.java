package com.bayamp.chaya.training.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bayamp.chaya.training.collections.Mobile;

public class MobileMain {

	public static  void main(String[] args) {
		
		List<Mobile> mobile = new ArrayList<Mobile>();
		mobile.add(new Mobile("iphone","XS",64,900));
		mobile.add(new Mobile("iphone","7",32,500));
		mobile.add(new Mobile("GooglePixel","3",64,900));
		mobile.add(new Mobile("OnePlus","6",64,800));
		mobile.add(new Mobile("Samsung","Note 10",128,1100));
		
		for(Mobile mob: mobile){
			System.out.println(mob);
		}
		
		Collections.sort(mobile);
		System.out.println("**************");
		for(Mobile mob: mobile){
			System.out.println(mob);
		}

	}

}
