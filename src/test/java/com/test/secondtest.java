package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class secondtest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		String s=driver.getTitle();
		System.out.println(s);
		String a=driver.getCurrentUrl();
		System.out.println(a);
		driver.quit();
	}

}
