package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utilities.DataProviders;
import junit.framework.Assert;
import testBase.BaseClass;

public class DataDrivenLoginTestCase  extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=Utilities.DataProviders.class)
	public void test(String username,String pass)
	{
		
		LoginPage l=new LoginPage(driver);
		boolean logo=l.displayLogo();
		Assert.assertEquals(logo, true);
		l.sendUsername(username);
		l.sendpass(pass);
		l.clickLogin();
		
		driver.findElement(By.xpath("\r\n"+ "//button[normalize-space()='Open Menu']")).click();
		driver.findElement(By.xpath("\r\n"+ "//a[normalize-space()='Logout']")).click();
		
	
		
		
	}

}
