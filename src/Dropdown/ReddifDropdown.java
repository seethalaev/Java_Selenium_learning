package Dropdown;

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
		  
		  WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		  Select obj2=new Select(monthelement);
		  obj2.selectByIndex(7);
		  
		  WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		  Select obj3=new Select(yearelement);
		  obj3.selectByValue("2001");
	  }
}
