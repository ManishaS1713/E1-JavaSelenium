package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest1 {

	// This is Object/WebElement Repository
	// Declaration
	@FindBy(name = "username")
	private WebElement usnTb;
	@FindBy(name = "pwd")
	private WebElement pwdTb;
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUsnTb() {
		return usnTb;
	}

	public WebElement getPwdTb() {
		return pwdTb;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//operational methods
	public void validLoginMethod(String username,String password) throws InterruptedException
	{
		usnTb.sendKeys(username);
		Thread.sleep(1000);
		pwdTb.sendKeys(password);
		Thread.sleep(1000);
		loginButton.click();
	}
	
	public void invalidLoginMethod(String username, String password) throws InterruptedException
	{
		usnTb.sendKeys(username);
		Thread.sleep(1000);
		pwdTb.sendKeys(password);
		Thread.sleep(1000);
		loginButton.click();
	}

}
