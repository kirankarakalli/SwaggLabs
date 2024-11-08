package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//div[@class='product_label']")WebElement productLabel;
	@FindBy(xpath="//*[name()='path' and contains(@fill,'currentCol')]")WebElement viewCart;
	@FindBy(xpath="//select[@class='product_sort_container']")WebElement productSort;
	@FindBy(xpath="//img[@class='inventory_item_img']")List<WebElement> productsList;
	@FindBy(xpath="//button[text()='ADD TO CART']")List<WebElement> AddToCart;
	@FindBy(xpath="//button[@class='btn_secondary btn_inventory']")List<WebElement> Remove;
	
	public boolean isLogoVisible()
	{
		return  productLabel.isDisplayed();
	}

	
	public void clickViewCart()
	{
		Actions act=new Actions(driver);
		act.moveToElement(viewCart).click().build().perform();
		
	}
	
	public void sortViaProduct(int index)
	{
		Select drp=new Select(productSort);
		drp.selectByIndex(index);
	}
	
	public void clickOnProduct(int index)
	{
		if(index>=0 && index<productsList.size())
		{
			productsList.get(index).click();
			
		}
		else
		{
			System.out.println("Invalid index");
		}
	}
	
	
	public void clickOnAddToCart(int index)
	{
		if(index>=0 && index<AddToCart.size())
		{
			AddToCart.get(index).click();
			
		}
		else
		{
			System.out.println("Invalid index");
		}
	}
	
	public void clickOnRemove(int index)
	{
		if(index>=0 && index<Remove.size())
		{
			Remove.get(index).click();
			
		}
		else
		{
			System.out.println("Invalid index");
		}
	}
	
	
	
	}
	
	
	
	



