package com.bayamp.archana.training.multiThreadingeg;

public class Hi extends Thread{

	public void run(){
		try {
			for (int i =0 ; i < 5 ;i++) {
				System.out.println("Hi");
				Thread.sleep(1000);
			} 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
