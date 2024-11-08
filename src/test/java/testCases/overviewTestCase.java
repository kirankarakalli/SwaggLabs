package testCases;

import org.testng.annotations.Test;

import PageObjects.OverviewPage;
import junit.framework.Assert;
import testBase.BaseClass;

public class overviewTestCase extends BaseClass{
	
	@Test
	public void placeorder()
	{
		InformationTestCase i=new InformationTestCase();
		i.info();
		
		OverviewPage o=new OverviewPage(driver);
		boolean status=o.islogodisplayed();
		Assert.assertEquals(status, true);
		String product=o.sendproductName();
		//Assert.assertEquals(product, "Sauce Labs Backpack");
		o.clickfinish();
		
		String msg=o.orderConfirm();
		Assert.assertEquals(msg, "THANK YOU FOR YOUR ORDER");
	}

}
