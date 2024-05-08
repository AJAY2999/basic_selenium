package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Credentials {

	@DataProvider(name="credential")
	public String[][] sendata() {
		String[][] data= {
				{"ajayykn@gmail.com","satpatdudum"},
				{"ajaylav02@gmail.com","satpatdudum"},
				{"ajaykumar02@gmail.com","satpatdudum"},
				{"aajaydashh95@gmail.com","satpatdudum"},
		};
		return data;
	}
	@Test(dataProvider="credential")
	public void Login(String email, String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
}
