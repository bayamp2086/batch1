package sonia.practicealgo;

public class AbstractSubclass extends AbstractClassPerson {
	
	
	public AbstractSubclass() {
		super("sonia");
		
	}
	
public void mycount() {
	System.out.println("count menthod of abstract class");
}

public static void main(String[]args) {
	
	AbstractClassPerson obj=new AbstractSubclass();
	obj.myNamePrint();
	obj.mycount();
	obj.printmessage();
	obj.printmessage("sonia");
}
}
