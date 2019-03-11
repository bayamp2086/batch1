package com.bayamp.archana.training.maxpeoplealive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  

public class MaxPeopleProgram {
	public static void main (String[] args) {
List<MaxAliveUtility> people = new ArrayList<MaxAliveUtility>();

MaxAliveUtility p1 = new MaxAliveUtility(1982, 2017);	
MaxAliveUtility p2 = new MaxAliveUtility(1923, 2004);
MaxAliveUtility p3 = new MaxAliveUtility(1988, 2015);	
MaxAliveUtility p4 = new MaxAliveUtility(1910, 1988);
MaxAliveUtility p5 = new MaxAliveUtility(1990, 2005);
MaxAliveUtility p6 = new MaxAliveUtility(2004, 2010);
Collections.addAll(people,p1,p2,p3,p4,p5,p6);

int a = MaxAliveUtility.getMaxYear(people);
System.out.println(a);
	}

}