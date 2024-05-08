package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_pop_up {

	public static void main(String[] args) throws Throwable {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			driver.switchTo().frame("login_page");
			driver.findElement(By.linkText("CONTINUE")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			a.accept();
			

	}

}
