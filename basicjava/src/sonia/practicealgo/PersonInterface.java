package sonia.practicealgo;

public interface PersonInterface {
	
	int count=0;
	
	public void printmessage() ;
	
	public void printmessage(String str);
	
	default void print() {
		
		System.out.println("Display Print in PersonInterface");
	}
	

}
