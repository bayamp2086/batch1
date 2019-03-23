package com.bayamp.chaya.training.collections;

public class Laptop {
	private String laptopName;
	private int ram;
	private int price;
	private String display;

	public Laptop(String laptopName, String display, int ram, int price) {
		this.laptopName = laptopName;
		this.ram = ram;
		this.price = price;
		this.display=display;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return laptopName +" "+ display +" " + ram +" " +price;
	}

}
