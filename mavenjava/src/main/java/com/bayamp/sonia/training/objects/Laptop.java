package com.bayamp.sonia.training.objects;

public class Laptop implements Comparable<Laptop> {
	
	private String ModelNo;
	private String brandName;
	private String ModelColor;
	private int modelMemory;
	private double modelPrice;
	
	public Laptop(String brandName,String ModelNo,String ModelColor,int modelMemory,double modelPrice)  {
		this.ModelNo=ModelNo;
		this.ModelColor=ModelColor;
		this.modelMemory=modelMemory;
		this.modelPrice=modelPrice;
		this.brandName=brandName;
		
	}
	public Laptop() {
		
	}
	
	public String getModelNo() {
		return ModelNo;
	}
	public void setModelNo(String modelNo) {
		ModelNo = modelNo;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelColor() {
		return ModelColor;
	}
	public void setModelColor(String modelColor) {
		ModelColor = modelColor;
	}
	public int getModelMemory() {
		return modelMemory;
	}
	public void setModelMemory(int modelMemory) {
		this.modelMemory = modelMemory;
	}
	public double getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Laptop) {
			Laptop ltp=(Laptop)o;
			if(ltp.getBrandName().equals(this.brandName) && 
					ltp.getModelColor().equals(this.ModelColor)&& 
					ltp.getModelMemory()==this.getModelMemory()&&
					ltp.getModelPrice()==this.getModelPrice()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "[ Laptop Brand :"+this.brandName+",Model Color :" +this.ModelColor +",Model No :"+this.ModelNo+","
				+ "Model Memory :"+this.modelMemory+
				",Model Price :"+this.modelPrice +"]";
	}

	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if (this.modelPrice > o.getModelPrice())
			return 1;
		else if (this.modelPrice < o.getModelPrice())
			return -1;
		else
			return 0;
	}

}
