package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_disp {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Boolean is=driver.findElement(By.name("login")).isDisplayed();
		System.out.println(is);
		
		Boolean iss=driver.findElement(By.name("login")).isSelected();
		System.out.println(iss);
	}

}
