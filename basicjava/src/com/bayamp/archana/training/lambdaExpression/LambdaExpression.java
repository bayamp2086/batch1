package com.bayamp.archana.training.lambdaExpression;

public class LambdaExpression {
	public static void main(String[] args) {
		// only in java 8 
		
		// pass arguments in interface
				A obj = (i) -> System.out.println("Hello " +i);
				obj.show(6);
				
		/*A obj = new B();
		obj.show();*/


		/*A obj = new A() 
		{	public void show() {
			System.out.println("Hello");
		}
		};
		obj.show();*/		



		/*A obj = () ->
				{
			System.out.println("Hello");
		};
         obj.show();*/


        /* A obj = () -> System.out.println("Hello");
		obj.show();*/
		
		
		

	}
}
