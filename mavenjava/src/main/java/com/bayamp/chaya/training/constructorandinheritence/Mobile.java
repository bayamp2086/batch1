package com.bayamp.chaya.training.constructorandinheritence;

public class Mobile implements Comparable<Mobile> {
	private String mobileName;
	private String model;
	private int memory;
	private int price;

	public Mobile(String mobileName, String model, int memory, int price) {
		this.mobileName = mobileName;
		this.model = model;
		this.memory = memory;
		this.price = price;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return mobileName + "" + model + " Memory: " + memory + " Price: " + price;

	}

	@Override
	public int compareTo(Mobile mobile) {
		if (this.getPrice() > mobile.getPrice()) {
			return 1;
		} else if (this.getPrice() < mobile.getPrice()) {
			return -1;
		}
		return 0;
	}

}
