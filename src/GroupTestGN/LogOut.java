package GroupTestGN;

import org.testng.annotations.Test;

public class LogOut {
	@Test(priority =1 , groups="UATTest")
	public void LogoutFunctionality() {
		System.out.println("This is Logout test");
	}
	@Test(priority =2 , dependsOnMethods ="LogoutFunctionality", groups= {"UATTest", "ProdTest"})
	public void LogouMessage() {
		System.out.println("This is logout notification message");
	}
}
