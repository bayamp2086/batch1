package com.bayamp.hellopackage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PasswordValidationTest2 {
	
		@DataProvider(name="validPasswordProvider")
		private static Object[][] validPasswordProvider(){
			String[] passwordArray= new String[] {"johN248$","Scott34#","Mickey66!"};
			Object[][] data= {passwordArray};
			return data;
}
		
		@DataProvider(name="invalidPasswordProvider")
		private static Object[][] invalidPasswordProvider(){
			String[] passwordArray= new String[] {null,"","JOHN248#","scot34#","michelle66!","Ab2cvd"};
			Object[][] data= {passwordArray};
			return data;
}
		@Test(dataProvider="validPasswordProvider")
		public void validPasswordTest(String[] password) {
			for(String s:password){
				boolean match=PasswordValidation.validate2(s);
				System.out.println(match);
				assertTrue(match,s+" should be valid");
			}
		}
		
		@Test(dataProvider="invalidPasswordProvider")
		public void invalidPasswordTest(String[] password) {
			for(String s:password){
				boolean match=PasswordValidation.validate2(s);
				System.out.println(match);
				assertFalse(match,s+" should be invalid");
			}
		}
		
		
}
