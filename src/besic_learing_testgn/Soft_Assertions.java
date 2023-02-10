package besic_learing_testgn;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {
	//Step 1:- You have to create an object of softAssert class
	//Sstep 2:- At the end of test case,when all your logic is completed, invoke the methids assertAll();
	
	@Test
	public void Validation() {
		SoftAssert softassert = new SoftAssert(); // Object Creation  
		
		int i= 23; int j=12;
		System.out.println("Sum is :" +(i+j)); //logic
		softassert.assertTrue(true); //soft assetion / validation
		
		boolean b1 =1<2;
		boolean b2 =2>3;
		softassert.assertEquals(b2, b1, "B2 is wrong string statement");
		
		softassert.assertAll(); //importance - this will give all teh exceptionss within the test case and it shoold be the the last stetement inside  a testccase.	 
	}
}
