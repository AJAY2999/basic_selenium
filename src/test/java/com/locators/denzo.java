package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class denzo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dunzo.com/bangalore");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Mango");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='ADD'])[3]")).click();
		}

}
