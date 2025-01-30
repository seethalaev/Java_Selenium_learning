package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMpage.FbLoginpgf;

public class FbTestpgf 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		FbLoginpgf lg=new FbLoginpgf(driver);
		lg.setvalues("asa@gmail.com","abcd");
		lg.login();
	}
}
