package com.bayamp.sonia.training.objects;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	private String carOwner;
	private String carModel;
	protected static int remainingparkcounter=10;
	protected static int totalparkcounter=0;
	protected static List<Car> list=new ArrayList<Car>();
	
	public Car(String carOwner,String carModel) {
		this.carModel=carModel;
		this.carOwner=carOwner;
		
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}
