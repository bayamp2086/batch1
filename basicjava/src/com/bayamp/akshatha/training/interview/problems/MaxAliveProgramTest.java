package com.bayamp.akshatha.training.interview.problems;
import java.util.List;

public class MaxAliveProgramTest {

	public static void main(String[] args) {
		
		int[][] popStats= {{1930,1950},{1934,1960},{1936,1945},{1945,1960},{1932,1938}};
		
		MaxAliveutility maxAliveUtil=new MaxAliveutility(popStats);
		List<Integer> listOfMaxYears =maxAliveUtil.getListOfMaxYears();
		int maxAliveCount=maxAliveUtil.getMaxAliveCount();
		System.out.println("Max people alive count: "+maxAliveCount);
		System.out.println("Years with maximum number of persons Alive: "+listOfMaxYears);
		
	}
}
