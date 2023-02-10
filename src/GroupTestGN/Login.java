package GroupTestGN;

import org.testng.annotations.Test;

public class Login {
	@Test(priority =1 , groups="smoketest")
	public void LoginUser() {
		System.out.println("This is Login test");
	}
	
	@Test(priority =2 , dependsOnMethods= "LoginUser" , groups= {"smoketest", "sanitytest"})
	public void ValidLoginUser() {
		System.out.println("This is validating login user");
	}
}
