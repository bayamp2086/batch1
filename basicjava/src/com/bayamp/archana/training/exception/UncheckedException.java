package com.bayamp.archana.training.exception;

public class UncheckedException {
	
	//Unchecked are the exceptions that are not checked at compiled time
	
	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		
		try{
		int z = y/x;
		System.out.println("Its an arithmetic exception cos its 0/10: " +z);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Its excecuting after try catch blockis surrounded ");
		
	}

}
