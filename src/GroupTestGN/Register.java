package GroupTestGN;

import org.testng.annotations.Test;

public class Register {
	//group -unittest , smoketest,sanitytest, regrasstiontest , unittest
	
		@Test(priority= 1 , groups ="unittest")
		public void RegisteUser() {
			System.out.println("This is registration test");
		}
		
		@Test(priority =2 , dependsOnMethods="RegisteUser", groups = {"unittest" ,"Smoketest"})
		public void validRegisterUser() {
			System.out.println("This is validating register user");
		}

	

}
