package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Saucedemo 
{
	ChromeDriver driver;
	@BeforeMethod
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	@Test
	public void test() throws IOException
	{
		File f=new File("D:\\Data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String name=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+name);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+pswd);
			
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).sendKeys(name);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(pswd);
			
			driver.findElement(By.id("login-button")).click();
			
		}
	}
}
