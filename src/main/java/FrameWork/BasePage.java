package FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public WebDriver driver;
	
	@BeforeClass
	public void Launch() {
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Webdriver launched and opened in full screen");
	}

	@BeforeMethod
	public void URL() {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Navigated to WebApplication");
	}
	
	@AfterMethod
	public void CloseApp() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Application logged out successfully");
	}
	
	@AfterClass
	public void CloseDriver() {
		driver.quit();
		Reporter.log("Webdriver is closed successfully");
	}
	
}
