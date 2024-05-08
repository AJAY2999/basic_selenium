package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_SS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        
        File temp = driver.findElement(By.xpath("//img[@alt='Facebook']")).getScreenshotAs(OutputType.FILE);
        File Container=new File("./src/ErrorShot/Image1.png");
        FileHandler.copy(temp, Container);
        

	}

}
