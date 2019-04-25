package com.bayamp.archana.training.multiThreadingeg;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		Hello obj1 = new Hello();
		Hi obj2 = new Hi();
		//obj1.print();
		//obj2.print();
		
		obj1.start();
		System.out.println("Good");
		obj2.start();
	}

}
