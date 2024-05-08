package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestData_Test1 {
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void insta() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	//	driver.manage().window().maximize();
		Reporter.log("insta page is launched",true);
		driver.quit();
	}
	
	@Test(enabled = false)
	public void facebook() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.manage().window().maximize();
		Reporter.log("FB page is launched",true);
		driver.quit();
	}
	
	@Test(dependsOnMethods = "insta")
	public void BMS() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/tumakuru-tumkur");
	//	driver.manage().window().maximize();
		Reporter.log("BMS page is launched",true);
		driver.quit();
	}
}
