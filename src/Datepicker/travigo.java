package Datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class travigo 
{


	WebDriver driver;
	@BeforeTest
	public void beforemethod()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.trivago.com");
	   //driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();										//check in inspect
		while(true)
		{
														 
		WebElement month = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));   									//month
		String mnth = month.getText();
		if(mnth.equalsIgnoreCase("December 2024"))
		{
			System.out.println(mnth);
		    break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		}
		}
		
		List<WebElement> alldate1 = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		
		for(WebElement dateelement:alldate1)														//completet date
		{
			String date=dateelement.getText();
			System.out.println(date);
			if(date.equalsIgnoreCase("25"))
			{
				System.out.println(date);
				dateelement.click();
				System.out.println("date selected");
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
