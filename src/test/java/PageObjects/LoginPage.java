package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
	@FindBy(xpath="//input[@class='btn_action']")WebElement loginBtn;
	@FindBy(xpath="//div[@class='login_logo']")WebElement logo;
	
	
	public void sendUsername(String user)
	{
		username.sendKeys(user);
	}
	
	public void sendpass(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public boolean displayLogo()
	{
		return logo.isDisplayed();
	}
	

}
