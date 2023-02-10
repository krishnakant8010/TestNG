package besic_learing_testgn;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class FirstTestGN {
	public String baseUrl = "http://35.202.93.203/SlpowerApp/#/signin";
    public WebDriver driver ;
		
	@BeforeTest
  	 void setBaseURL() {
	 driver = 	new ChromeDriver();
	 driver.get(baseUrl);
	}
	 @Test
	 public void verfifyHomepageTitle() {
		 String expectedTitle = "Admin Login | SLPower";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
	}
	 @AfterTest
	 public void endSession() {
		 driver.quit();
	 }
}
