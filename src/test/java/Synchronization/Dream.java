package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.dream11.com/");
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("send-sms-iframe");
		driver.switchTo().frame(driver.findElement(By.id("send-sms-iframe")));
		
		WebElement phone = driver.findElement(By.id("regEmail"));
		     phone .sendKeys("9620671804");
		     phone.clear();
     	     driver.switchTo().parentFrame();
		     
		     driver.switchTo().frame(0);
		     driver.findElement(By.id("regEmail")).sendKeys("8217581765");
		

	}

}
