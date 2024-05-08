package com.test;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("aajaydashh95@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mustang#2999");
		driver.findElement(By.name("login")).click();
		
		
	}

}
