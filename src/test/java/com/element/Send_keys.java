package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    Thread.sleep(3000);
    WebElement username=driver.findElement(By.name("firstname"));
    username.sendKeys("Ajay",Keys.CONTROL+"A");
    username.sendKeys(Keys.CONTROL+"C");
    WebElement surname=driver.findElement(By.name("lastname"));
    surname.sendKeys(Keys.CONTROL+"V");
 
	}

}

