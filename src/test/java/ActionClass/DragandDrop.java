package ActionClass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("username")).sendKeys("aajaydashh95@gmail.com");
	//	driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//span[text()=\"Continue\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("iamrude@2999");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//div[text()=\"My Trello board\"]")).click();
		
	}

}
