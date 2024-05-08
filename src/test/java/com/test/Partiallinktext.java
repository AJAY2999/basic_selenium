package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Register")).click(); 
        //driver.findElement(By.linkText("Books")).click(); //using linktext
       // driver.findElement(By.partialLinkText("BOOKS")).click();  //using partial linktext
        
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("AJAY");
        driver.findElement(By.id("LastName")).sendKeys("KUMAR");
        driver.findElement(By.id("Email")).sendKeys("ajayykn@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("CRAZYWORLD");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("CRAZYWORLD");
        
      //  driver.findElement(By.id("register-button")).click(); 
        
      //  driver.quit();
        
	}

}
