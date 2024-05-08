package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.woodenstreet.com/");	
	    driver.findElement(By.cssSelector("img[alt=\"Wooden Sofa Set Furniture\"]")).click();		

	}

}
