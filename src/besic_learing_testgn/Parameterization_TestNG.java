package besic_learing_testgn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization_TestNG {
	
		public static WebDriver driver;
		
		@Test 
		@Parameters({"Browser", "url", "email", "password"}) 
		public void Hotmail(String Browser ,String url, String email, String password) {
		
			if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); //Browser input parameter
			}else if (Browser.equals("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize(); 
			driver.get(url); //url is onout parametrer 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.findElement(By.linkText("Sign in")).click();
			
			driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys(email); //email is inout parameter
			
			driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
			
			
			driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys(password); //password is input parameter
			
			
			driver.findElement(By.className("button ext-button primary ext-primary")).click();
			  
			//driver.quit();
		
		}
		
		
	

}
