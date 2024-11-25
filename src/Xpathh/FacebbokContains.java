//load fb,dynamic elements-contains used
package Xpathh;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebbokContains 
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
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anu");
		  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("akd34");
		  driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	  }
	  
}
