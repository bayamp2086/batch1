package com.bayamp.sonia.training.objects.programs;

import java.util.Comparator;

import com.bayamp.sonia.training.objects.IPhone;
import com.bayamp.sonia.training.objects.Laptop;

public class ObjectComparator implements Comparator<Object> {

	private String comparatorObj;

	public ObjectComparator(String comparatorObj) {

		this.comparatorObj = comparatorObj;

	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof IPhone && o2 instanceof IPhone) {
			IPhone op1 = (IPhone) o1;
			IPhone op2 = (IPhone) o2;

			if (comparatorObj.equals("getModelNo")) {
				return op1.getModelNo().compareTo(op2.getModelNo());
			} 
			else if (comparatorObj.equals("getModelColor")) {
				return op1.getModelColor().compareTo(op2.getModelColor());
			} 
			else if (comparatorObj.equals("modelMemory")) {
				if (op1.getModelMemory() > op2.getModelMemory())
					return 1;
				else if (op1.getModelMemory() < op2.getModelMemory())
					return -1;
				else
					return 0;

			} 
			else if (comparatorObj.equals("modelPrice")) {

				if (op1.getModelPrice() > op2.getModelPrice())
					return 1;
				else if (op1.getModelPrice() < op2.getModelPrice())
					return -1;
				else
					return 0;

				// return Double.compare(op1.getModelPrice(), op2.getModelPrice());
			} 
			else {
				return op1.getModelNo().compareTo(op2.getModelNo());
			}

		} else if (o1 instanceof Laptop && o2 instanceof Laptop) {
			
			Laptop op1=(Laptop)o1;
			Laptop op2=(Laptop)o2;
			if (comparatorObj.equals("getModelNo")) {
				return op1.getModelNo().compareTo(op2.getModelNo());
			}
			if (comparatorObj.equals("getBrandName")) {
				return op1.getBrandName().compareTo(op2.getBrandName());
			}
			else if (comparatorObj.equals("getModelColor")) {
				return op1.getModelColor().compareTo(op2.getModelColor());
			} 
			else if (comparatorObj.equals("modelMemory")) {
				if (op1.getModelMemory() > op2.getModelMemory())
					return 1;
				else if (op1.getModelMemory() < op2.getModelMemory())
					return -1;
				else
					return 0;

			} 
			else if (comparatorObj.equals("modelPrice")) {

				if (op1.getModelPrice() > op2.getModelPrice())
					return 1;
				else if (op1.getModelPrice() < op2.getModelPrice())
					return -1;
				else
					return 0;

				// return Double.compare(op1.getModelPrice(), op2.getModelPrice());
			} 
			else {
				return op1.getModelNo().compareTo(op2.getModelNo());
			}
			
		}
		else {
			return 0;
		}

	}
}
