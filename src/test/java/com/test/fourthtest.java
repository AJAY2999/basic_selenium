package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fourthtest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		String ids=driver.getPageSource();
		System.out.println(ids);
        driver.quit();
	}

}
