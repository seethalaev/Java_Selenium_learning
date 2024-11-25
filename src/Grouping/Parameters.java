package Grouping;

import org.testng.annotations.Test;

public class Parameters 
{
	@org.testng.annotations.Parameters("a")
	@Test
	public static void main(String v)
	{
		System.out.println("Parameter values is:"+v);
	}
}
