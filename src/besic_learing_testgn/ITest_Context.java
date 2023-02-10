package besic_learing_testgn;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITest_Context {
//ItestContext is an interface
//purpuse -within the same java files or class files, it helps sharing data within the test cases  
	@Test(priority = 1)
	public void SetUp(ITestContext context) {
		System.out.println("This is setup of our new Laptop");
		context.setAttribute("Windows10", "Asus");
	}
	
	@Test(priority =2, dependsOnMethods = "SetUp")
	public void Logic(ITestContext context) {
		System.out.println("This is local funcation  of our new Laptop");
		String OperatingSystem = (String)context.getAttribute("Windows10");
		System.out.println("This is setup for the oprtating System of Asus laptop : " + OperatingSystem);
		context.setAttribute("Complex", "DevOps + Agile");
	}
	
	@Test(priority =3,dependsOnMethods = {"SetUp","Logic"})
	public void exit(ITestContext context) {
		System.out.println("This is exit of our new Laptop");
		String OperatingSystem = (String)context.getAttribute("Windows10");
		System.out.println("This is setup for the oprtating System of Asus laptop : " + OperatingSystem);
		String LogicComplexity  = (String)context.getAttribute("Complex");
		System.out.println("The logic LogicComplexity even a the exit point is:" + LogicComplexity );
		
	}
}
