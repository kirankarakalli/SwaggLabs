package testCases;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.OrderInformation;
import junit.framework.Assert;
import testBase.BaseClass;

public class InformationTestCase extends BaseClass{
	@Test
	public void info()
	{
		cartTestCase c=new cartTestCase();
		c.cart();
		
		OrderInformation o=new OrderInformation(driver);
		boolean status=o.islogoDisplayed();
		Assert.assertEquals(status, true);
		o.sendFirstName("kiran");
		o.sendlastName("k");
		o.sendzip("563142");
		o.clickContinue();
		
	}

}
