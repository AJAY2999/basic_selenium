package com.test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class thirdtest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
        Dimension d=new Dimension(800,500);
        driver.manage().window().setSize(d);
        
        Thread.sleep(3000);
        
        Point p=new Point(500,200);
        driver.manage().window().setPosition(p);
        
        Point o=driver.manage().window().getPosition();
        System.out.println(o);
        		
        
        Dimension a=driver.manage().window().getSize();
        System.out.println(a);
        
        Thread.sleep(3000);
        
        driver.quit();
	}

}
