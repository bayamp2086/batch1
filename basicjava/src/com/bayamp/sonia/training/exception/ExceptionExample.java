package com.bayamp.sonia.training.exception;

import java.io.IOException;

import com.bayamp.sonia.training.objects.Address;
import com.bayamp.sonia.training.objects.Laptop;
import com.bayamp.sonia.training.objects.Person;
import com.bayamp.sonia.training.objects.Student;
import com.bayamp.sonia.training.utils.ExceptionUtility;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p=new Student("","",new Address());
		
		Laptop lpt=new Laptop();
		
		//handle NullPointer exception
		
		ExceptionUtility.GetNullPointerException(lpt);
		
		//handle Arithmetic Exception
		
		ExceptionUtility.GetArithmeticException();
		
		//handle NumberFormat Exception
		
		ExceptionUtility.GetNumberFormatException();
		
		//handle ClassCastException Exception
		
		ExceptionUtility.GetClassCastException(p);
		
		//handle ClassNotFoundException Exception
		
		ExceptionUtility.GetClassNotFoundException();
		
		//handle ArrayIndexOutofbound Exception
		
		ExceptionUtility.GetArrayIndexOutofBoundException();
		
		
		//uncheckedException
		
		
		ExceptionUtility.UncheckedException();
		
		
		//handle OutofMemory Exception
		
		//ExceptionUtility.GetOutOfMemoryException(p);
		
		
		
		
	}

}
