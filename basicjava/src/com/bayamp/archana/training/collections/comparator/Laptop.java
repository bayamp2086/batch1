package com.bayamp.archana.training.collections.comparator;

public class Laptop implements Comparable<Laptop> {
	private String model;
	private int price;
	private int memory;
	private String color;
	private String size;
	
	Laptop(String lModel, int lPrice, int lMemory, String processor, String lSize ){
		this.color = processor;
	    this.price = lPrice;
	    this.memory = lMemory;
	    this.model=lModel;
	    this.size = lSize;
		
	}

	public String getModel() {
		return model;
	}
    
	public int getPrice () {
		return price;
	}
	
	public int getMemory() {
		return memory;
		
	}
	public String getColor() {
		return color;
		
	}
	public String getSize() {
		return size;
		
	}

	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(price==o.price)
		return 0;
		else if(price>o.price)
		return 1;
		else
			return -1;
	}
	

}
