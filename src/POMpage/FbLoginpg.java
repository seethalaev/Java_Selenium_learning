package POMpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbLoginpg
{
	WebDriver driver;
	By username=By.id("email");
	By password=By.id("pass");
	By login=By.name("login");
	
 public FbLoginpg(WebDriver driver)
  {
	this.driver=driver;
  }
 public void setvalues(String name,String pswd)
 {
	 driver.findElement(username).sendKeys(name);
	 driver.findElement(password).sendKeys(pswd);
 }
 public void loginbtn()
 {
	 driver.findElement(login).click();
 }
	
}
