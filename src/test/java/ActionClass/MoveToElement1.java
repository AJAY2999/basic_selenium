package ActionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		Actions a=new Actions(driver);
		a.moveToLocation(213, 36).perform();
	//	a.moveToLocation(213, 36).click().perform();
		

	}

}
