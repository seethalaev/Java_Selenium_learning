package POMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMpage.FbLoginpg;

public class FbTestpg
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
	public void testlogin()
	{
		FbLoginpg test=new FbLoginpg(driver);
		test.setvalues("abc@gmail.com","asdd");
		test.loginbtn();
		
	}
}
