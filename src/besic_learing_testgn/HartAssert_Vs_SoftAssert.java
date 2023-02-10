package besic_learing_testgn;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HartAssert_Vs_SoftAssert {

	@Test
	public void HartAssertLogic() {
		System.out.println("This is my first hart assert statement");
		Assert.assertTrue(true);
		
		System.out.println("this is my second hart assert statement");
		Assert.assertTrue(false);
		
		System.out.println("This is my third hart assert statemenet");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void SoftAssertLogic() {
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("This is my first soft assert statement");
		softassert.assertTrue(true);
		
		System.out.println("This is my second soft assert statement");
		softassert.assertTrue(false);
		
		System.out.println("This is my third soft assert statement");
		softassert.assertTrue(true);
				
		softassert.assertAll();
		
	}
}
