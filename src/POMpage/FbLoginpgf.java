package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpgf 
{
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	@FindBy(id="pass")
	WebElement fbpaswd;
	@FindBy(name="login")
	WebElement logiin;
	
	public FbLoginpgf(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String paswrd)
	{
		fbemail.sendKeys(email);
		fbpaswd.sendKeys(paswrd);
	}
	public void login()
	{
		logiin.click();
	}
}
