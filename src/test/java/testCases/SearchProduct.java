package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import junit.framework.Assert;
import testBase.BaseClass;

public class SearchProduct extends BaseClass {
		
	@Parameters({"index"})
	@Test(groups= {"regression"})
	public void addtocart(int index)
	{
		loginTestcase l=new loginTestcase();
		l.test();
		
		ProductsPage p=new ProductsPage(driver);
		boolean status=p.isLogoVisible();
		//Assert.assertEquals(status, true);
		p.sortViaProduct(1);
		p.clickOnAddToCart(index);
		p.clickViewCart();
		//p.clickOnRemove(0);
		//p.clickOnProduct(0);
		
		
	}

}
