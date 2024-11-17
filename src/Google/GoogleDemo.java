//Load google page
//Title verify
package Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String actualtitle=driver.getTitle();
		String expec="Google";
		if(actualtitle.equalsIgnoreCase(expec))
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
			
		}
		//driver.close();//close current window
		//driver.quit();//entire browser
	}
}
