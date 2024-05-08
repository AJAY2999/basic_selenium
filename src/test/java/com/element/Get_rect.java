package com.element;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_rect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		Rectangle emailrect = email.getRect();
		Rectangle passwordrect = email.getRect();
		
		System.out.println(emailrect.getX());
		System.out.println(passwordrect.getX());
		
		if(emailrect.getX()==passwordrect.getX())
		{
			System.out.println("it is equal");
		}
		else {
			System.out.println("It is not equal");
		}
		
		

	}

}
