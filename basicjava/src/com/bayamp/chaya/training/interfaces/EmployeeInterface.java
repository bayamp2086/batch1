package com.bayamp.chaya.training.interfaces;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Person;

public class EmployeeInterface extends Person implements IPerson {
	private static int count = 0;


	public EmployeeInterface(String fname1, String lname1, Address2 add) {
		super(fname1, lname1, add);
		count++;
	}

	public int getCount() {
		return count;
	}

}
