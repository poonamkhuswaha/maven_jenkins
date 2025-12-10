package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	WebDriver driver;

	public SignUp(WebDriver driver){
	this.driver = driver;
		
		PageFactory.initElements(driver, this);		
	}
	

	@FindBy(xpath = "//*[@type='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "mui-2")
	private WebElement pw;

	public WebElement getPw() {
		return pw;
	}


	@FindBy(id = "mui-3")
	private WebElement cpw;

	public WebElement getCPw() {
		return cpw;
	}

	@FindBy(xpath = "//*[text()='Solo Artist']")
	private WebElement YourPrimaryRole;

	public WebElement getYourPrimaryRole() {
		return YourPrimaryRole;
	}
		
	@FindBy(xpath = "//button[text()= 'Create Account']")
	private WebElement SignupBtn;

	public WebElement getSignupBtn() {

		return SignupBtn;
	}

}
