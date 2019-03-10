package com.bayamp.chaya.training.driver;

import com.bayamp.chaya.training.math.util.MaximumAlive;

public class MaximumAliveMain {

	public static void main(String[] args) {
		int birthYear[] = { 1955, 1956, 1997, 1965, 1963 };
		int deathYear[] = { 1999, 1965, 1965, 1966, 2010 };

		MaximumAlive.aliveCount(birthYear, deathYear);
	}

}
