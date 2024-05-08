package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_enabled_displayed {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement is=driver.findElement(By.name("login"));
		System.out.println(is.isDisplayed());
		System.out.println(is.isEnabled());
		System.out.println(is.isSelected());
		
	}

}
