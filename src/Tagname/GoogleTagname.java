//load google,images-links checked using tagname
package Tagname;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTagname 
	{
	
		  ChromeDriver driver;
		  @Before
		  public void before()
		  {
			  driver=new ChromeDriver();
			  driver.get("https://www.google.com/");
		  }
		  @Test
		  public void test()
		  {
			 List<WebElement> li = driver.findElements(By.tagName("a"));
			 System.out.println(li.size());
		  }
	}
