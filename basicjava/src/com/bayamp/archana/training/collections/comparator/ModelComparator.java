package com.bayamp.archana.training.collections.comparator;

import java.util.Comparator;

public class ModelComparator implements Comparator<Iphone>{


	@Override
	public int compare(Iphone o1, Iphone o2) {
		// TODO Auto-generated method stub
		return o1.getModel().compareTo(o2.getModel());
	}

}
