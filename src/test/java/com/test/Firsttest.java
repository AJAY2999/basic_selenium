package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Firsttest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	    driver.manage().window().minimize();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.quit();
	}
}
		
        
        
 
