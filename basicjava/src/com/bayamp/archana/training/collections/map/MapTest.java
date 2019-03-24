package com.bayamp.archana.training.collections.map;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MapTest {
	
	
	@Test
	public void countryPositiveTest() {
		String expected = "Delhi";
<<<<<<< Updated upstream

		String actual = MapUtils.Capital("India") ;

		//String actual = MapUtils.getCapital1("India") ;


		Assert.assertEquals(actual, expected);
		Reporter.log(actual, true);
	}

	//@Test
	public void countryNegativeTest() {
		String expected = "does not exist in the db " ;
	}
=======
		String actual = MapUtils.getCapital1("India") ;
		Assert.assertEquals(actual, expected);
		Reporter.log(actual, true);
	}
	
>>>>>>> Stashed changes
	@Test
	public void cpuntryNegativeTest() {
		String expected =null;
		String actual = MapUtils.getCapital1("Germany");
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
	
	

	// what is dev did a mistake and he is returning some value insetad of throwing some exception 013 and 203 and the next pic
	
	// nullpointer exception pic 131 and 153

}