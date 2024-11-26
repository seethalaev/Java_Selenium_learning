//basic strucutre of testng
package TstNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basictestng 
{
	@BeforeTest()
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod()
	public void url()
	{
		System.out.println("url open");
	}
	@Test(priority=3)  //enabled=false
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=1,dependsOnMethods= {"test1"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=2,invocationCount=2)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("report");
	}
	@AfterTest()
	public void aftertest()
	{
		System.out.println("browserclose");
	}
}
