package sonia.practicealgo;

public abstract class AbstractClassPerson implements PersonInterface {
	
	public abstract void mycount();
	
	String str="";
	
	private AbstractClassPerson(){
		System.out.println("in AbstractClassPerson constructor");
	}
	
	protected AbstractClassPerson(String str) {
		System.out.println("in AbstractClassPerson constructor parametere "+str);
	}
	
	public void myNamePrint()
	{
		System.out.println("My name print method");
	}
	
	public void printmessage() {
		
		System.out.println("Implemented Intyerface Method");
	}
	
	public void printmessage(String msg) {
		str=str+msg+PersonInterface.count;
		System.out.println("Implemented printmessage Method"+str);
	}
	

}
