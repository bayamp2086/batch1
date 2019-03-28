package com.bayamp.sonia.training.objects;

import java.util.Comparator;

public class IPhone {
	
	private String ModelNo;
	private String ModelColor;
	private int modelMemory;
	private double modelPrice;
	
	public IPhone(String ModelNo,String ModelColor,int modelMemory,double modelPrice) {
		this.ModelNo=ModelNo;
		this.ModelColor=ModelColor;
		this.modelMemory=modelMemory;
		this.modelPrice=modelPrice;
		
	}
	public String getModelNo() {
		return ModelNo;
	}

	public void setModelNo(String modelNo) {
		ModelNo = modelNo;
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

	public Double getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(Double modelPrice) {
		this.modelPrice = modelPrice;
	}
	
	@Override
	public String toString() {
		return "[ IPhone Model Color :" +this.ModelColor +",Model No :"+this.ModelNo+","
				+ "Model Memory :"+this.modelMemory+
				",Model Price :"+this.modelPrice +"]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof IPhone) {
			IPhone ip=(IPhone)o;
			if(this.ModelColor.equals(ip.ModelColor) && this.modelMemory==ip.modelMemory && 
					this.ModelNo.equals(ip.ModelNo) && this.modelPrice==ip.modelPrice) {
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
	

	

}
