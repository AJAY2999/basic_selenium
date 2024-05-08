package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("java basics");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Learn Java in 14 Minutes (seriously)']")).click();
		
		

	}

}
