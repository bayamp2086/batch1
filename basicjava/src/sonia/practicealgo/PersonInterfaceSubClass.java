package sonia.practicealgo;

public class PersonInterfaceSubClass implements PersonInterface,PersonInterface1  {
	
	
public void printmessage() {}
	
	public void printmessage(String str) {}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		PersonInterface.super.print();
		PersonInterface1.super.print1();
		
		
	}
	
	public static void main(String[]args) {
		
		PersonInterfaceSubClass obj=new PersonInterfaceSubClass();
		obj.print();
	}
	
}
