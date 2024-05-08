package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class carwale {

	@Test(groups="ajay")
	public void car() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/");
		Reporter.log("carwale webpage is launchaed",true);
		driver.quit();
	}
}
