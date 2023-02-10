package besic_learing_testgn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class method_ex {
//@@BeforeMethod <->@Test<->@AfterMethod:>this is a combination 
	
	@BeforeMethod 
	public void UserRegistation() {
		System.out.println("User is geting registration");
	}
	
	@Test
	public void UserLogin() {
		System.out.println("User is able to Login success");
	}
	
	@Test
	public void UserMoneyTranfar() {
		System.out.println("User is able to tansfer to money to anothte account");
	} 
	
	@AfterMethod
	public void UserLogOut() {
		System.out.println("User is able to Log Out Success");
	}
	
}
