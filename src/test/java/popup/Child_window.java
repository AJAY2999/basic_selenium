package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
        WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
        a.sendKeys("mobile", Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Green']")).click();
        
        String parent = driver.getWindowHandle();  
        Set<String> child = driver.getWindowHandles();
        
        child.remove(parent);
        
        for(String control:child)
        {
        	driver.switchTo().window(control);
        	driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']")).click();
        }
	}

}
