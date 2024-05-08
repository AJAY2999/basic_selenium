package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ddriver_element {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();
		
		

	}

}
