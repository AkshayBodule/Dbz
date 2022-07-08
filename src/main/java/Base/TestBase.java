package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public static WebDriver driver;
	
	public String readProperty(String value) throws IOException
	{
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Personal_Framework\\src\\main\\java\\Config\\Config.properties");
		pro.load(file);
		return pro.getProperty(value);
		
	}
	
	public void initialization() throws IOException
	{
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get(readProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
