package com.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gett_css {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement css=driver.findElement(By.linkText("Try Free"));
		System.out.println(css.getCssValue("color"));
		System.out.println(css.getCssValue("align-items"));
		System.out.println(css.getCssValue("background-color"));
		System.out.println(css.getCssValue("cursor"));
		System.out.println();
		System.out.println(css.getLocation());
		System.out.println(css.getSize());
		System.out.println(css.getTagName());
		System.out.println(css.getText());
	}

}
