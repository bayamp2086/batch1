package com.bayamp.sonia.training.programs;

public class EqualsOperatorProgram {
	
	public static void main(String []args) {
		// TODO Auto-generated method stub

	
	
			String s="Sonia";
			String s1="Virag";
			
			String s2=new String("Sonia");
			
			String s3=new String("Virag");
			
			String s6=new String("Sonia");
			
		
			String s4="Sonia";
					
			String s5="Virag";
			
			StringBuffer sf=new StringBuffer("Sonia");
			
			if(s==s4) {
				
				System.out.println("True ,S ===S4");
			}
			else {
				
				System.out.println("False ,S ===S4");
			}
			
			if(s==s2) {
				
				System.out.println("True ,S ===s4");
			}
			else {
				
				System.out.println("False ,S ===s4");
			}
			
			if(s.equals(s2)) {
				
				System.out.println("True ,s.equals(s2)");
			}
			
			if(s2.equals(s6)) {
				System.out.println("True ,s2.equals(s6)");
			}
			if(s2==s6) {
				
				System.out.println("True ,s2==s6");
			}
			else {
				System.out.println("False ,s2==s6");
				
			}
			
			if(sf.toString().equals(s)) {
				
				System.out.println("True ,sf.toString().equals(s)");
			}
	
	}

}
