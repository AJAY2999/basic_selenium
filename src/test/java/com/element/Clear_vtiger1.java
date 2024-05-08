package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_vtiger1 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		username.clear();
		password.clear();
		username.sendKeys("Ajay");
		password.sendKeys("CRAZY");
		

	}

}
