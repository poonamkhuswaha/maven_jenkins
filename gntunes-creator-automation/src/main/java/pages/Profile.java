package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	WebDriver driver;
	
	public Profile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//div[@class='MuiAvatar-root MuiAvatar-circular css-3i9vrz']//img[@class='MuiAvatar-img css-1hy9t21']")
	private WebElement profileIcon;


	public WebElement getProfileIcon() 
	{
		return profileIcon;			
	}	
	
	@FindBy(xpath= "//div[text() = 'Account']")
	private WebElement account;


	public WebElement getAccount() 
	{
		return account;
		
	}	
		
	@FindBy(xpath= "//a[contains(@href,'general')]")
	private WebElement general;

	public WebElement getGeneral() 
	{
		return general;
			
	}	
	
	
	@FindBy(xpath= "//a[contains(@href,'collab')]")
	private WebElement uploadPhoto;

	public WebElement getUploadPhoto() 
	{
		return uploadPhoto;
			
	}	
	
	
	@FindBy(xpath= "//*[name()='path' and contains(@d,'M6 19c0 1.1')]")
	private WebElement deletePhoto;

	public WebElement getDeletPhoto() 
	{
		return deletePhoto;
			
	}	
	
	@FindBy(xpath= "//button[.//img[@alt='Upload Icon']]")
	private WebElement addPhoto;

	public WebElement getAddPhoto() 
	{
		return addPhoto;
			
	}	
	
	@FindBy(xpath = "//*[@href=\"/?user=category\"]")
	private WebElement category;
	public WebElement getcategory()
	{
		return category;
		
	}
	
	@FindBy(xpath="//span[text()='Rapper']")
	private WebElement selectcategory;
	public WebElement getselectcategory()
	{
		return selectcategory;
		
	}
			


	
}
