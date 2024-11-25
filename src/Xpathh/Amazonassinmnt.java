//load amazon,locate parent to child.//*[@id='nav-xshop']--parent
package Xpathh;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonassinmnt 
{
  ChromeDriver driver;
  @Before
  public void before()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  }
  @org.junit.Test
  public void Mobiles()
  {
	  //driver.manage().window().maximize();
	 //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
	 //driver.findElement(By.xpath("//span id[@id=\"nav-cart-count']")).click();
	  driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
  } 
}
