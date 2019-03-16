package com.bayamp.akshatha.training.collections;

import java.util.Comparator;

public class Laptop {
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", size=" + size + ", color=" + color + "]";
	}
	private String model;
	private int size;
	private String color;
	public Laptop(String model, int size, String color) {
		super();
		this.model = model;
		this.size = size;
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	
	
}

class LaptopModelComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop l1, Laptop l2) {
		
		return l1.getModel().compareTo(l2.getModel());
		
	}

}

 class LaptopSizeComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop l1, Laptop l2) {
		
		return l1.getModel().compareTo(l2.getModel());
		
	}
	
 }
