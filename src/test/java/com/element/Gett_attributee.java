package com.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gett_attributee {

	public static void main(String[] args) throws Throwable {

				WebDriver driver=new ChromeDriver();
				driver.get("https://www.actitime.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				String attribut = driver.findElement(By.linkText("Try Free")).getAttribute("href");
				System.out.println(attribut);

			}

	}


