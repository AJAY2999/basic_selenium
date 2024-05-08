package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();	
		driver.switchTo().alert().sendKeys("AJAY");
		driver.switchTo().alert().accept();
		

	}

}
