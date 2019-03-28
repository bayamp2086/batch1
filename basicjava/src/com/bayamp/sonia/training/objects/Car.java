package com.bayamp.sonia.training.objects;

public class Car {

	private String carOwner;
	private String carModel;

	public Car(String carOwner, String carModel) {
		this.carModel = carModel;
		this.carOwner = carOwner;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carModel == null) ? 0 : carModel.hashCode());
		result = prime * result + ((carOwner == null) ? 0 : carOwner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carModel == null) {
			if (other.carModel != null)
				return false;
		} else if (!carModel.equals(other.carModel))
			return false;
		if (carOwner == null) {
			if (other.carOwner != null)
				return false;
		} else if (!carOwner.equals(other.carOwner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [carOwner=" + carOwner + ", carModel=" + carModel + "]";
	}

}
