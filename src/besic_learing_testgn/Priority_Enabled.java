package besic_learing_testgn;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//if you do not set priority of test cases, then it will Alphabetical order of method names- it will execute. 
// you have to priority to all test cases else TestGN will the Alphabetical order in execution. 
// enable = true is default used, we do set or not
public class Priority_Enabled {
	@Test  (priority = 1)
	public void Register_User() {
		System.out.println("User is able to Register");
	}
	
	@Test (priority=2)
	public void Valid_Login() {
		System.out.println("Valid login");
	}
	
	@Test(priority=3)
	public void Home_Page() {
		System.out.println("Home Page visisble");
	}
	
	@Test  (priority = 4, enabled = false  )
	public void AddNews() {
		System.out.println("Adding News");
	}
	
	@Test  (priority = 5)
	public void User_LogOut() {
		System.out.println("User is able to Logs out");
	}
}

