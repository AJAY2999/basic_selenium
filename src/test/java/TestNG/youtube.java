package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class youtube {

	@Test(groups="lav")
	public void yt() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Reporter.log("yt webpage is launchaed",true);
		driver.quit();
}
}
