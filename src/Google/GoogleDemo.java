//Load google page

package Google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();//close current window
		//driver.quit();//entire browser
		
		
	}

}
