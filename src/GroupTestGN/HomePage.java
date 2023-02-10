package GroupTestGN;

import org.testng.annotations.Test;

	public class HomePage {
	@Test(priority =1 , groups="regasstion")
	public void HomePageLanding() {
		System.out.println("This is home page landing test");
	}
	
	@Test (priority =2, dependsOnMethods ="HomePageLanding" ,groups="regasstion")
	public void HomePageProfileLogo() {
		System.out.println("This is validating profile login in home page");
	}
}

