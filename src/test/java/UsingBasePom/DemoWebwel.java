package UsingBasePom;

import org.testng.annotations.Test;

import FrameWork.BasePage;
import FrameWork.WelcomePage;

public class DemoWebwel extends BasePage {
	@Test
	public void Reg() {
		WelcomePage a=new WelcomePage(driver);
		a.getRegisterlink().click();
}
}
