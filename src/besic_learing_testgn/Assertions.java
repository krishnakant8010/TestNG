package besic_learing_testgn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	// Assertions = checkpoint valudation points
	// Assesrt :- Hard assert 
	@Test
	public void Criticals () {
	String ExpectedOutPut = "We are learninh in English";	
	String ActualOutPut ="We are learing in englis and Hindi";
	Assert.assertEquals(ActualOutPut, ExpectedOutPut); 
	}
	
	@Test
	public void High() {
		boolean b1 = 1<2; //true
		boolean b2 = 2>3; //false
	Assert.assertTrue(b1 != b2," 2 can never be garther than 3");	
		
	}	
	
	@Test
	public void Medium() {
		//Assert.fail();	
		Assert.fail("Fail deliberately ");
	}
	
	@Test
	public void Low() {
		
	}
}
