//alert handle 
package AlertHandling;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
	ChromeDriver driver=new ChromeDriver();
	@Before()
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/html.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}
}
