package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

	public OverviewPage(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(xpath="//div[@class='subheader']")WebElement logo;
	@FindBy(xpath="//div[@class='inventory_item_name']")WebElement productName;
	@FindBy(xpath="//a[@class='btn_action cart_button']")WebElement finishBtn;
	@FindBy(xpath="//a[@class='cart_cancel_link btn_secondary']")WebElement cancelBtn;
	@FindBy(xpath="\r\n"+ "//h2[@class='complete-header']")WebElement confirmation;
	
	public  boolean islogodisplayed()
	{
		return logo.isDisplayed();
	}
	
	public String sendproductName()
	{
		return productName.getText();
	}
	
	
	public void clickfinish()
	{
		finishBtn.click();
	}
	
	public void clickcancel()
	{
		cancelBtn.click();
	}
	
	
	public String orderConfirm()
	{
		return confirmation.getText();
	}
	
	
	

}
