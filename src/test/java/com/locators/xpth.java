package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpth {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  String err = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
	  System.out.println(err);
	  
	  
	}

}
