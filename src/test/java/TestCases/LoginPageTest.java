package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage log;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		log = new LoginPage();
	}
	
	@Test (enabled = false)
	public void verifyupstoxlogotest()
	{
		log.verifyupstoxLogo();
	}
	
	@Test (enabled = false)
	public void verifyUpstoxTitleTest()
	{
		String value =log.verifyUpstoxTitle();
		Assert.assertEquals(value, "Upstox login");
	}
	
	@Test (enabled = false)
	public void verifyloginTitleTest()
	{
		String value = log.verifyloginTitle();
		Assert.assertEquals(value, "Sign in to your account");
	}
	
	@Test
	public void loginToUpstoxTest() throws InterruptedException
	{
		log.loginToUpstox();
	}
	
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
