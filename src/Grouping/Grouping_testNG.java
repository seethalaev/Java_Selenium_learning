package Grouping;

import org.testng.annotations.Test;

public class Grouping_testNG 
{
	@Test(groups= {"sanity"})
	public void main1()
	{
		System.out.println("This is sanity");
	}
	@Test(groups= {"sanity","smoke"})
	public void main2()
	{
		System.out.println("This is sanity,smoke");
	}
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("This is regression");
	}
	@Test(groups= {"sanity","regression"})
	public void main4()
	{
		System.out.println("This is sanit,regression");
	}
	@Test(groups= {"regression"})
	public void main5()
	{
		System.out.println("This is regression");
	}
}
