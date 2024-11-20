//for multiple activites alert interface used
package AlertHandling;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt
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
		Alert a = driver.switchTo().alert();
		
		String actual=a.getText();
		String expec="hello I am an alert box";
		if(actual.equals(expec)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}
}
