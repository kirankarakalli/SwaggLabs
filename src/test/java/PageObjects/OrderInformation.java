package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformation extends BasePage{

	public OrderInformation(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='subheader']")WebElement logo;
	@FindBy(xpath="//input[@placeholder='First Name']")WebElement firstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")WebElement lastName;
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")WebElement zip;
	@FindBy(xpath="//input[@class='btn_primary cart_button']")WebElement ContinueBtn;
	@FindBy(xpath="//a[@class='cart_cancel_link btn_secondary']")WebElement cancel;
	
	
	public boolean islogoDisplayed()
	{
		return logo.isDisplayed();
	}
	
	public void sendFirstName(String userfirstname)
	{
		firstName.sendKeys(userfirstname);
	}
	
	
	public void sendlastName(String userlastname)
	{
		lastName.sendKeys(userlastname);
	}
	
	public void sendzip(String zipcode)
	{
		zip.sendKeys(zipcode);
	}
	
	public void clickContinue()
	{
		ContinueBtn.click();
	}
	
	
	public void clickCancel()
	{
		cancel.click();
	}
	
	
	
	
	
	
	
	
	

}
