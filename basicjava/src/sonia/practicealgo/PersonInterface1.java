package sonia.practicealgo;

public interface PersonInterface1 {
	
	int count=0;
	
	public void printmessage() ;
	
	public void printmessage(String str);
	
	default void print1() {
		
		System.out.println("Display Print in PersonInterface1");
	}
	

}
