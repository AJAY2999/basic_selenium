package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class amazon {
	@Test(groups="ajay")
	public void amaz() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon webpage book.comis launchaed",true);
		driver.quit();

}
}