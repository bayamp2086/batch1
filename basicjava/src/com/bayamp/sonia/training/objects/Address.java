package com.bayamp.sonia.training.objects;

public class Address {

	private String streetNo;
	private String stressAdd;
	private String studentCity;
	private String studentState;
	private String studentCountry;
	private String zipCode;

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getStressAdd() {
		return stressAdd;
	}

	public void setStressAdd(String stressAdd) {
		this.stressAdd = stressAdd;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentCountry() {
		return studentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String toString() {

		return "\n" + streetNo + "," + stressAdd + "\n" + studentCity + ","
				+ studentState + "\n" + studentCountry + "," + zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((streetNo == null) ? 0 : streetNo.hashCode());
		result = prime * result + ((stressAdd == null) ? 0 : stressAdd.hashCode());
		result = prime * result + ((studentCity == null) ? 0 : studentCity.hashCode());
		result = prime * result + ((studentCountry == null) ? 0 : studentCountry.hashCode());
		result = prime * result + ((studentState == null) ? 0 : studentState.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Address) {
			
			Address ad=(Address)o;
			if(this.streetNo.equals(ad.streetNo) && this.stressAdd.equals(ad.stressAdd) && 
					this.studentCity.equals(ad.studentCity) && this.studentState.equals(ad.studentState)
					&& this.zipCode.equals(ad.zipCode) && this.studentCountry.equals(ad.studentCountry)) {
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
