package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.abhibus.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder=\"Onward Journey Date\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"March\"]/../../..//span[text()='29']")).click();
	}

}
