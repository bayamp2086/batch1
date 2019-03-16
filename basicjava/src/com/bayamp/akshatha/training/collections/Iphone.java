package com.bayamp.akshatha.training.collections;

public class Iphone implements Comparable<Iphone>{
	private String model;
	private int size;
	private String color;
	
	
	public Iphone(String model, int size, String color) {
		super();
		this.model = model;
		this.size = size;
		this.color = color;
	}


	@Override
	public int compareTo(Iphone o) {
		// TODO Auto-generated method stub
		return this.size-o.size;
	}


	@Override
	public String toString() {
		return "Iphone [model=" + model + ", size=" + size + ", color=" + color + "]";
	}
	
}
