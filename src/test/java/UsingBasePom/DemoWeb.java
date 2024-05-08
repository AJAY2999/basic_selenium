package UsingBasePom;

import org.testng.annotations.Test;

import FrameWork.BasePage;
import FrameWork.RegisterPage;
import FrameWork.WelcomePage;



public class DemoWeb extends BasePage {

	@Test
	public void Reg() {
		WelcomePage w=new WelcomePage(driver);
		w.getRegisterlink().click();
		
		RegisterPage r=new RegisterPage(driver);
		r.getRadiobutton().click();
		r.getFirstname().sendKeys("Ajay");
		r.getLastname().sendKeys("Lav");
		r.getEmail().sendKeys("ajaylav02@gmail.com");
		r.getPassword().sendKeys("ajaylav");
		r.getConfpassword().sendKeys("ajaylav");	
	}
}
