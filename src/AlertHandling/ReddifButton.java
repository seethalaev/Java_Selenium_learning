package AlertHandling;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifButton 
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
		  boolean reddif = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		  if(reddif)
		  {
			  System.out.println("displayed");
		  }
		  else
		  {
			  System.out.println("not displayed");
		  }
		  
		  boolean checkbox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		  if(checkbox)
		  {
			  System.out.println("selected");
		  }
		  else
		  {
			  System.out.println("not selected");
		  }
		  
		  boolean button = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
		  if(button)
		  {
			  System.out.println("selected");
		  }
		  else
		  {
			  System.out.println("not selected");
		  }

	  }
}
