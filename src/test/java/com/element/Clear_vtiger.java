package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear_vtiger {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		username.clear();
		password.clear();
		Thread.sleep(3000);
		username.sendKeys("Ajay");
		password.sendKeys("CRAZY");
		Thread.sleep(3000);
		driver.quit();
	}
}	


	