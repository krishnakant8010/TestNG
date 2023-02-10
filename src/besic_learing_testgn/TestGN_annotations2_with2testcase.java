package besic_learing_testgn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGN_annotations2_with2testcase {
	@BeforeSuite
	
	public void beforeSuite(){
		System.out.println("This is before Suite annatations");
	}	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before  test annatations");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class annatations");
	} 
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method annatations");
	}
	
	@Test
	public void loginTest() {
		System.out.println("This is test case");
	}
	
	@Test
	public void registerTest() {
		System.out.println("This is resgiser test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method  annatations ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class annatations");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test annatations");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite annatations");
	}
}
