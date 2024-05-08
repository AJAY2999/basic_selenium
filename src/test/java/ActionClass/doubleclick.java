package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/product.php");
		
		Actions a=new Actions(driver);
		//WebElement b = driver.findElement(By.xpath("//button[@id=\"add\"]"));
		
		WebElement b = driver.findElement(By.id("add"));
		a.doubleClick(b).perform();

	}

}
