package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class facebook {
	@Test(groups="kumar")
	public void fb() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("fb webpage is launchaed",true);
		driver.quit();

}
}
