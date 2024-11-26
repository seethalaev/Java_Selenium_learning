//rightclick,doubleclick,get text
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AlertHandling.Alert;

public class RightDoubleclk 
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span")); //click rightclick me
		act.contextClick(right).perform();
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/span")).click(); //click edit
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		WebElement dbl = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dbl).perform();
		org.openqa.selenium.Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		
	}
}
