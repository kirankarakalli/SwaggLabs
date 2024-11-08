package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import junit.framework.Assert;
import testBase.BaseClass;

public class loginTestcase  extends BaseClass {
	
	
	@Test(groups= {"sanity"})
	public void test()
	{
		LoginPage l=new LoginPage(driver);
		boolean logo=l.displayLogo();
		Assert.assertEquals(logo, true);
		l.sendUsername("standard_user");
		l.sendpass("secret_sauce");
		l.clickLogin();
		
		
	
		
		
	}

}
