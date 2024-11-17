package Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
		String getpagsrc=driver.getPageSource();
		String mail="Gmail";
		if(getpagsrc.contains("mail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://www.google.com/");
//	{
//		String imagsrc=driver.getPageSource();
//		String imag="Images";
//		if(imagsrc.contains("Imag"));
//		{
//			System.out.println("images pass");
//		}
//		else
//		{
//			System.out.println("images fail");
//		}}
}
