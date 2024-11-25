//load fb,date-month-year insepct,value selected,count kitti
package Dropdown;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDrodown 
{

	ChromeDriver driver;
	@Before
	public void Bfore()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
	@Test
	public void test()
	{
		
		WebElement dateelement = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select obj=new Select(dateelement);
		obj.selectByValue("7");
		List<WebElement> li = obj.getOptions();
		System.out.println(li.size());
		
		WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select obj2=new Select(monthelement);
		obj2.selectByIndex(7);
		List<WebElement> li2 = obj2.getOptions();
		System.out.println(li2.size());
		
		WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select obj3=new Select(yearelement);
		obj3.selectByVisibleText("2001");
		List<WebElement> li3 = obj3.getOptions();
		System.out.println(li3.size());
		
	}
}
