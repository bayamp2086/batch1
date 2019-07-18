package com.bayamp.sonia.training.objects;

import java.util.UUID;

public class CTEmployee extends Person implements IPerson,IPersonID {

	static int count=0;
	
	
	private double salary;
	private long studentID;
	
	
	public CTEmployee(String fname, String lname, Address address) {
		super(fname, lname, address);
		// TODO Auto-generated constructor stub
		count=count+1;
	}

	public long calculateStudID() {
		// TODO Auto-generated method stub
		return UUID.randomUUID().getMostSignificantBits();
	}

	public int getPersonCount() {
		// TODO Auto-generated method stub
		return this.count;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEmployee Salary :" + salary +"\n StudentID"+this.studentID ;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (studentID ^ (studentID >>> 32));
		return result;
	}

	
	@Override
	public boolean equals(Object o) {
		
		if(!(o instanceof CTEmployee)) {
			return false;
		}
		
			
		CTEmployee cte=(CTEmployee)o;
		if(this.salary==cte.salary && this.studentID==cte.studentID) {
			return true;
		}
		else {
			return false;
		}
		
				
		
	}


	

	
}
