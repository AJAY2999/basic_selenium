package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='hai babe'", hidden); //choose executescript for key key object
		
	}

}
