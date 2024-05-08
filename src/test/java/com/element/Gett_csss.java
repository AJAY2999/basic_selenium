package com.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gett_csss {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String css=driver.findElement(By.linkText("Try Free")).getCssValue("color");
		System.out.println(css);
	}

}
