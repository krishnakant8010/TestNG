package besic_learing_testgn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dependencies_ex {
	public static WebDriver driver;
	
	@BeforeTest 
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test (priority =1)
	public void landing_page() {
		System.out.println(driver.getCurrentUrl());
		String CurrentURL  ="https://www.mycarhelpline.com" ;
		
		if (CurrentURL.equals("https://www.mycarhelpline.com")) {
			System.out.println("This case landing page is Pass ");
		}else {
			System.out.println("This case landing page is Fail ");
		}
		//Assert.fail("Delaverty Fail");
	}	
	@Test (priority =2, dependsOnMethods = "landing_page")
	public void calculater() {
	driver.findElement(By.xpath("//body/div[@id='container']/div[@id='topnav']/div[@id='bluemenu']/ul[1]/li[5]/a[1]")).click();		
	}
	
	@Test (priority =3, dependsOnMethods = {"landing_page", "calculater"})
	public void ReturnToHome() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@Test (priority =4)
	public void tearDown() {
		driver.quit();
	}
}
