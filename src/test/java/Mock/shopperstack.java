package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor a=(JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("//a[text()=\"Swagger documentation\"]")).click();
				break;
			} catch(Exception e) {
				a.executeScript("window.scrollBy(0,500)");
			}
		}
		
      
	}

}
