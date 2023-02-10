package besic_learing_testgn;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Alwaysrun {
	//alwaysRun =true (when TestNG skips execution of a test case for whatever reason, and you want to that Test case to execute then we use alwaysRun.
	// alwaysRun =true in compared to enabled =false
	@Test (priority =1)
	public void Begin() {
		System.out.println("This is the initial test case");
		Assert.fail("we are fail this task case");
	}
	
	@Test (priority =2, dependsOnMethods ="Begin", alwaysRun = true)
	public void Ready() {
		System.out.println("This is the next  Ready test case");
	}
	
	@Test (priority =3, dependsOnMethods = {"Begin" , "Ready"}, alwaysRun = true)
	public void Steady() {
		System.out.println("This is the next Steady test case");
	}
	
	@Test (priority =4, dependsOnMethods= {"Begin" , "Ready","Steady"})
	public void Go() {
		System.out.println("This is the next Go test case");
	}
}
