//drag and drop using actionclass
package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop 
{
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		
		String text=drop.getText();
		if(text.equals(drop))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
	}
}
