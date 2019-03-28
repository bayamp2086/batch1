package com.bayamp.akshatha.training.basics;

import java.util.Arrays;
import java.util.Scanner;

public class MathProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to get Factorial: ");
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int factI=MathUtilityClass.factorialByIteration(n);
		int factR=MathUtilityClass.factorialByRecursion(n);
		
		System.out.println("\nFactorial by Iteration: "+factI);
		System.out.println("\nFactorial by Recursion: "+factI);
		
		System.out.println("\nEnter a number to check for prime number: ");
		Scanner s2 = new Scanner(System.in);
		int p = s2.nextInt();
		boolean isPrime=MathUtilityClass.isPrime(p);
		
		System.out.println("\nIs Prime? "+isPrime);
		
		System.out.println("\nEnter 2 numbers to swap:\n");
		Scanner s3 = new Scanner(System.in);
		int[] a= new int[2];
		
		a[0]=s3.nextInt();
		a[1]=s3.nextInt();
		
		System.out.println("Swap with temperory variable: "+Arrays.toString(MathUtilityClass.swapTemp(a)));
		System.out.println("Swap without temperory variable: "+Arrays.toString(MathUtilityClass.swap(a)));
		
		
		
	}

}
