package com.bayamp.chaya.training.interfaces;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.bayamp.chaya.training.constructorandinheritence.Address2;
import com.bayamp.chaya.training.constructorandinheritence.Person;

public class StudentInterface extends Person implements IPerson, AnotherInterface {

	public StudentInterface(String fname1, String lname1, Address2 add) {
		super(fname1, lname1, add);
		count++;

	}

	private double gpa;
	private static int count = 0;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getCount() {

		return count;
	}

	public int generateID() {
		int id = new Random().nextInt(1000);

		return id;
	}

}
