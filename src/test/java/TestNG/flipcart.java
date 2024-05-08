package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flipcart {
	@Test(groups="kumar")
	public void flipkrt() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("flipkart webpage is launchaed",true);
		driver.quit();

}
}
