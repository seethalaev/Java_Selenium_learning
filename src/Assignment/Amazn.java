package Assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazn {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazon()
	{
	WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	search.clear();
	search.sendKeys("mobiles",Keys.ENTER);
	
	//WebElement bestsellers=driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
	//bestsellers.click();WebElement cart=driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
	WebElement cart=driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
	cart.click();
	//driver.navigate().back();
	WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
	signin.click();
	WebElement mail = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
	mail.sendKeys("sheeth",Keys.ENTER);
	driver.findElement(By.xpath("*[@id=\"continue\"")).click();
	driver.navigate().back();  //go back to previous page
	driver.navigate().back();
	
	WebElement menu=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	menu.click();
	
	
	}
}