package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//img[@alt='upstox logo']") private WebElement upstoxLogo;
	@FindBy(xpath = "//h1[@data-qa='login-title']") private WebElement loginTitle;
	@FindBy(xpath = "//input[@id='userCode']") private WebElement userCode;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signUpBtn;
	@FindBy(xpath = "//input[@id='yob']") private WebElement yearOfBirth;
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement imGoodBtn;

	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyupstoxLogo()
	{
		upstoxLogo.isDisplayed();
	}
	
	public String verifyUpstoxTitle()
	{
		return driver.getTitle();
	}
	
	public String verifyloginTitle()
	{
		return loginTitle.getText();
	}
	
	public void loginToUpstox() throws InterruptedException
	{
		userCode.sendKeys("4LA8FE");

		password.sendKeys("Aksh@y10");
		signUpBtn.click();
		yearOfBirth.sendKeys("1995");
		imGoodBtn.click();

	}
}
