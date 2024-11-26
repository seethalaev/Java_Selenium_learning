package Windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindHndls 
{
	WebDriver driver;
	@BeforeTest
	public void beforemethod()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("anu@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();		
			}
		}
		
	}
}
