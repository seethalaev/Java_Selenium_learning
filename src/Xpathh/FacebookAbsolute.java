//load fb using absolute xpath-username,relative xpath-email,login
package Xpathh;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAbsolute 
{
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("anu emmanuel",Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("asdfgh1@",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anu");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("akd34");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
