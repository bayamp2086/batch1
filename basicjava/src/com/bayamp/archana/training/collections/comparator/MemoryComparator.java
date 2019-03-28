package com.bayamp.archana.training.collections.comparator;

import java.util.Comparator;

public class MemoryComparator  implements Comparator<Iphone>{

	@Override
	public int compare(Iphone o1, Iphone o2) {
		// TODO Auto-generated method stub
		Iphone i1 = (Iphone)o1;
		Iphone i2 = (Iphone)o2;
		if (i1.getMemory() == i2.getMemory())
			return 0;
		else if (i1.getMemory()> i2.getMemory())
			return 1;
		else 
			return -1;
		
	}

}
