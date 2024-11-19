package Tagname;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddiffText 
{

			  ChromeDriver driver;
			  @Before
			  public void before()
			  {
				  driver=new ChromeDriver();
				  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			  }
			  @Test
			  public void test()
			  {
				 WebElement actualtext = driver.findElement(By.xpath("//input[@id='Register']"));
				 String button=actualtext.getAttribute("value");
				 System.out.println(button); 
				 if(button.equals("Create my account >>"))
				 {
					 System.out.println("pass");
				 }
					 else
					 {
						 System.out.println("fail");
					 }
				  
			  }
}
