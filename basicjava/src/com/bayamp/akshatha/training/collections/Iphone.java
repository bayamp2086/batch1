package com.bayamp.akshatha.training.collections;

public class Iphone implements Comparable<Iphone> {
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
	public int compareTo(Iphone i) {
		// TODO Auto-generated method stub

		int modelCmp = model.compareTo(i.model);
		if (modelCmp != 0) {
			return modelCmp;
		}

		int sizeCmp = size - i.getSize();
		if (sizeCmp != 0) {
			return sizeCmp;
		}

		else
			return color.compareTo(i.getColor());
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

	@Override
	public String toString() {
		return "Iphone [model=" + model + ", size=" + size + ", color=" + color + "]";
	}

}
