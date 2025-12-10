package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"mui-1\"]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy (xpath= "//*[@id=\"mui-2\"]")
	private WebElement password;
	
	public WebElement getPass()
	{
		return password;
	}
	
	@FindBy (xpath="//*[text()=\"Sign In\"]")
	private WebElement sign;
	
	public WebElement getButton()
	{
		return sign;
		
	}

}
