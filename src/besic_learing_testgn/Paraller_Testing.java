package besic_learing_testgn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paraller_Testing {
	public static WebDriver driver;
	
	@Test
	public void Test1() throws InterruptedException {
		System.out.println("This is first test |" +Thread.currentThread().getId());
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@Test
	public void Test2() throws Exception {
		System.out.println("This is test 2 | " +Thread.currentThread().getId());
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://guru99.com");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(threadPoolSize =3 ,invocationCount= 3, timeOut=2000)
	public void Test3() throws Exception {
		System.out.println("This is  test 3 | " +Thread.currentThread().getId());
		
		
	}
}
