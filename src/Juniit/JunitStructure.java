//Junit structure
package Juniit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitStructure 
{
	@Before
	public void browseropen()
	{
		System.out.println("broswer open");	
	}
	@Test
	public void test()
	{
		System.out.println("Test activityy");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 activity");
	}
	@After
	public void aftertest()
	{
		System.out.println("Browser close");
	}
}
