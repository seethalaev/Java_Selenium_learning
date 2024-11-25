//load reddif,give values to 3 fields
package Xpathh;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff 
{

	  ChromeDriver driver;
	  @Before
	  public void before()
	  {
		  driver=new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  }
	  @org.junit.Test
	  public void Test()
	  {
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("anu");
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("a@gmail.com");
		  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	  }
}
