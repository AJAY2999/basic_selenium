package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		Actions a=new Actions(driver);
		
		driver.findElement(By.id("password")).sendKeys("timid");
		
		WebElement b = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
		a.clickAndHold(b).perform();
		
		Thread.sleep(5000);
		
		a.release(b).perform();
		
		a.keyDown(Keys.ARROW_DOWN).perform();
		
	}

}