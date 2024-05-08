package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class confiramation_popup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://licindia.in/");
	//	driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.linkText("Login")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
   //     a.dismiss();
		
	}

}
