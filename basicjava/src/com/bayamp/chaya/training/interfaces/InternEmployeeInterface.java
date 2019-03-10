package com.bayamp.chaya.training.interfaces;

import java.util.Random;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Person;

public class InternEmployeeInterface extends Person implements IPerson, AnotherInterface {
	private static int count = 0;

	public InternEmployeeInterface(String fname1, String lname1, Address2 add) {
		super(fname1, lname1, add);
		count++;
	}

	public int generateID() {
		int id = new Random().nextInt(1000);

		return id;
	}

	public int getCount() {
		return count;
	}

}
