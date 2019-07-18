package com.bayamp.sonia.training.programs;

public class MaximumAliveProgram {

	public static void main(String[] args) {

		int birthYear[] = { 1990, 2000, 2010 };
		int deathYear[] = { 2020, 2040, 2030 };

		MaximumAlive obj = new MaximumAlive();

		int maxAliveYearandCountArr[] = obj.getmaximumAlive(birthYear, deathYear);

		System.out.println("Year in which Maximum Alive " + maxAliveYearandCountArr[0]);
		System.out.println("Maximum No of People Alive " + maxAliveYearandCountArr[1]);
	}

}
