package SelectClass;

import java.awt.SystemColor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
        WebElement a = driver.findElement(By.id("cars"));
        
        Select s=new Select(a);
        
        s.selectByIndex(0);
        s.selectByValue("99");
        s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
        
        s.deselectByIndex(1);
        
        System.out.println(s.getFirstSelectedOption().getText());
        
      
	}

}
