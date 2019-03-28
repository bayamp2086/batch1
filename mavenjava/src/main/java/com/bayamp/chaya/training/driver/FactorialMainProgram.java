package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.math.util.Factorial;

public class FactorialMainProgram {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorialIterative(6));
		System.out.println(fact.factorialRecursive(5));
	}

}
