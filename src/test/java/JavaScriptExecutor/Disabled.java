package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	//	Thread.sleep(3000);
		driver.findElement(By.linkText("jdk-8u401-linux-aarch64.rpm")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement a = driver.findElement(By.linkText("Download jdk-8u401-linux-aarch64.rpm"));
        js.executeScript("arguments[0].click()", a);
	}

}
