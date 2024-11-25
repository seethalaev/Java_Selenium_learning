//load google,selenium click
package Locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooleLocate 
{
	ChromeDriver driver;
  @org.junit.Before
  public void Before()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
   
  @Test
  public void test()
  {
	  driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	//driver.findElement(By.name("btnk")).click();
  }
}
