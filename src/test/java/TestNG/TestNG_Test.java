package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test {

	@Test(priority = -1, invocationCount = 2, threadPoolSize = 2)
	public void insta() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	//	driver.manage().window().maximize();
		Reporter.log("insta page is launched",true);
		driver.quit();
	}
	
	@Test(priority = 0)
	public void facebook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.manage().window().maximize();
		Reporter.log("FB page is launched",true);
		driver.quit();
	}
	
	@Test(priority = 1)
	public void BMS() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/tumakuru-tumkur");
	//	driver.manage().window().maximize();
		Reporter.log("BMS page is launched",true);
		driver.quit();
	}
}
