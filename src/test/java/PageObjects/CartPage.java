package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	

	@FindBy(xpath="//div[@class='cart_item']")List<WebElement> items;
	@FindBy(xpath="//button[@class='btn_secondary cart_button']")List<WebElement> Remove;
	@FindBy(xpath="//a[@class='btn_action checkout_button']")WebElement checkout;
	@FindBy(xpath="//a[@class='btn_secondary']")WebElement continueshopping;
	@FindBy(xpath="//div[@class='subheader']")WebElement logo;
	
	public int noOfItems()
	{
		return items.size();
	}
	
	public void removeFromCart(int index)
	{
		if(index>=0 && index<Remove.size())
		{
			Remove.get(index).click();
		}
		else
		{
			System.out.print("invalid index");
			
		}
	}
	
	public void clickOnCheckout()
	{
		checkout.click();
	}
	
	public boolean isLogoVisible()
	{
		return logo.isDisplayed();
	}
	
	public void continueBtn()
	{
		continueshopping.click();
	}
	

}
