package Juniit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;

public class PgsrcJunit
{
  ChromeDriver driver;
  @Before
  public void Before()
  {
	 driver=new ChromeDriver(); 
	 driver.get("https://www.google.com/");
	 
  }
  @Test
  public void Test1()
  {
	String title=driver.getTitle();
	String titl="Google";
	if(title.equals("titl"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}}
	@Test
	public void Test2()
	{
		String actualcontent=driver.getPageSource();
		String expec="Gmail";
		if(actualcontent.contains("expec"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fails");
		}}
		@After
		public void aftertest()
		{
			driver.close();
		}
}
