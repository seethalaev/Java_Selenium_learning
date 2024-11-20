//load reddif,use select class and give values to dropdown of date,month,year,get count
package Dropdown;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReddifDropdown 
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
		  
		  WebElement dateelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		  Select obj=new Select(dateelement);                    //constructor htrough value pass cheythath mansasilayilla
		  obj.selectByValue("07");
		  List<WebElement> li = obj.getOptions();                //obj enthukond choose cheythu enn areela
		  System.out.println(li.size());
		  
		  
		  WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		  Select obj2=new Select(monthelement);
		  obj2.selectByIndex(7);
		  List<WebElement> li2 = obj2.getOptions();
		  System.out.println(li2.size());
		  
		  WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		  Select obj3=new Select(yearelement);
		  obj3.selectByVisibleText("2001");
		  List<WebElement> li3 = obj3.getOptions();
		  System.out.println(li3.size());
	  }
}
