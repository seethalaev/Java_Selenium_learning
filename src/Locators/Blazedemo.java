//load blazedemo,value pass in each field
package Locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo 
{
	ChromeDriver driver;
	@org.junit.Before
	 public void Before()
		{
			driver=new ChromeDriver();
			driver.get("https://blazedemo.com/register");
		}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("seethu",Keys.ENTER);
		driver.findElement(By.name("company")).sendKeys("abc solutions",Keys.ENTER);
		driver.findElement(By.id("email")).sendKeys("a@gmail.com",Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("122aas",Keys.ENTER);
		driver.findElement(By.id("password-confirm")).sendKeys("122aas",Keys.ENTER);
	}
}
