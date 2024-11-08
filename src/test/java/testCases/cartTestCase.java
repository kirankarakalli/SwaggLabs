package testCases;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import junit.framework.Assert;
import testBase.BaseClass;

public class cartTestCase  extends BaseClass{
	
	@Test
	public void cart() 
	{
		
		SearchProduct s=new SearchProduct();
		s.addtocart(0);
		CartPage c=new CartPage(driver);
		boolean status=c.isLogoVisible();
		Assert.assertEquals(status, true);
		int num=c.noOfItems();
		Assert.assertEquals(num, 1);
		
		//c.removeFromCart(0);
		
		//c.continueBtn();
		c.clickOnCheckout();
	}

}
