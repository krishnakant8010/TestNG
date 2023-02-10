package besic_learing_testgn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sessoinHanding {

		public static void main(String...Strins) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.guru99.com/sessions-parallel-run-and-dependency-in-selenium.html");
		
			WebDriver driver2 = new ChromeDriver();
			driver2.get("https://www.guru99.com/sessions-parallel-run-and-dependency-in-selenium.html");

		}
}