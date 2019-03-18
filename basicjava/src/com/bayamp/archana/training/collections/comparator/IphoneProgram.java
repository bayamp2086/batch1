package com.bayamp.archana.training.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IphoneProgram {

	public static void main(String args[]) {
		//		Iphone i1 = new Iphone("iPhone XS", 256, "Black");
		Iphone i2 = new Iphone("iPhone 5", 64, "white");
		Iphone i3 = new Iphone("iPhone 6", 512, "rosegold");

		//MemoryComparator mc = new MemoryComparator();

		List<Iphone> iph = new ArrayList<Iphone>();
		iph.add(new Iphone("iPhone XS", 256, "Black"));
		iph.add(i2);
		iph.add(i3);

//		when get index is not available use this iterator
		/*Iterator<Iphone> itr2 = iph.iterator();
		while (itr2.hasNext()) {
			Iphone st = itr2.next();
			System.out.println(st.getModel() + " " + st.getMemory() + " " + st.getColor());
		}*/

		Collections.sort(iph, new MemoryComparator());
		//Collections.sort(iph, mc);
		System.out.println("Sorting by Memory");
		for (Iphone iphone : iph) {
			System.out.println(iphone.getModel()+" "+iphone.getMemory()+" "+ iphone.getColor()); 
		}
		System.out.println("\n"+"Sorting by Model");  

		Collections.sort(iph,new ModelComparator());  
		for(Iphone ip: iph){  
			System.out.println(ip.getModel()+" "+ip.getMemory()+" "+ ip.getColor());  
		}  
	}

}
