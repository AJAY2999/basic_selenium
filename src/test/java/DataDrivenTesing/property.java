package DataDrivenTesing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class property {

	public static void main(String[] args) throws IOException {
		
		//read the data from the file
		FileInputStream a=new FileInputStream(".\\src\\test\\resources\\TestData\\TestData.properties");
		
		//create the object for property file
		Properties b=new Properties();
		
		//load the data
		b.load(a);
	   	String c = b.getProperty("url2");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get(c);

	}

}
