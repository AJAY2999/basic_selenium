package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flower picture",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Images'])[1]")).click();
		JavascriptExecutor a=(JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='Beautiful Flowers']")).click();
				break;
			} catch(Exception e) {
				a.executeScript("window.scrollBy(0,500)");
			}
		}
			

	}

}
