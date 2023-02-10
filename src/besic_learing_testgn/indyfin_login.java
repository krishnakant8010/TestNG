package besic_learing_testgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class indyfin_login {
	
	
		public String baseUrl = "https://dev.indyfin.com/#/login?redirect=%5Bobject%20Object%5D";
	    String driverPath = "C:\\chromedriver.exe";
	    public WebDriver driver ; 
	    
	    @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chromedriver.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      @Test
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Indyfin Advisor Portal";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @Test
	      	public void login() {
	    	  driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div[2]/amplify-authenticator/amplify-sign-in//amplify-form-section/amplify-auth-fields//div/amplify-email-field//amplify-form-field//div/div[2]/slot/amplify-input/input")).sendKeys("kk");
	      }
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }

	
}
