package Locators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookid 
{
	ChromeDriver driver;
	@Before
	public void Bfore()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abu",Keys.ENTER);
		driver.findElement(By.id("pass")).sendKeys("asdfg",Keys.ENTER);
		driver.findElement(By.name("login")).click();
	}
	@After
	public void aftertest()
	{
		driver.close();
	}
}
