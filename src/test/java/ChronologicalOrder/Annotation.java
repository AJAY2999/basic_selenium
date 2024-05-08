package ChronologicalOrder;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@AfterMethod
	public void am() {
		Reporter.log("aftermethod is launched",true);
	}

	@BeforeMethod
	public void bm() {
		Reporter.log("before method is launched",true);
	}
	
	@BeforeSuite
	public void bs() {
		Reporter.log("before suite is launched",true);
	}
	
	@AfterSuite
	public void as() {
		Reporter.log("after suite is launched",true);
	}
	
	@Test
	public void tst() {
		Reporter.log("test is launched",true);
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("after class is launched",true);
	}
	
	@BeforeClass
	public void bc() {
		Reporter.log("before class is launched",true);
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("before test is launched",true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("after test is launched");
	}
}
