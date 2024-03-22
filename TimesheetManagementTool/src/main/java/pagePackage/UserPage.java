package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	//declaration
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="passwordText") private WebElement passwordTB;
	@FindBy(name="passwordTextRetype") private WebElement retypepasswordTB;
	@FindBy(name="firstName") private WebElement firstnameTB;
	@FindBy(name="lastName") private WebElement lastnameTB;
	@FindBy(id="right12") private WebElement modifyTimeTrackCheckBox;
	@FindBy(id="right2") private WebElement manageCustomerAndProjectCheckBox;
	@FindBy(id="right1") private WebElement generateReportsCheckBox;
	@FindBy(id="right5") private WebElement manageUserCheckBox;
	@FindBy(id="right7") private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath = "//input[contains(@value, ' Cancel')]") private WebElement cancelButton;
	@FindBy(xpath = "//input[@type='submit']") private WebElement createUserButton;
	
	//initialization
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypepasswordTB() {
		return retypepasswordTB;
	}

	public WebElement getFirstnameTB() {
		return firstnameTB;
	}

	public WebElement getLastnameTB() {
		return lastnameTB;
	}

	public WebElement getModifyTimeTrackCheckBox() {
		return modifyTimeTrackCheckBox;
	}

	public WebElement getManageCustomerAndProjectCheckBox() {
		return manageCustomerAndProjectCheckBox;
	}

	public WebElement getGenerateReportsCheckBox() {
		return generateReportsCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	
	public void createNewUser(String usn,String pwd,String fname,String lname) throws InterruptedException
	{
		Thread.sleep(1000);
		usernameTB.sendKeys(usn);
		passwordTB.sendKeys(pwd);
		retypepasswordTB.sendKeys(pwd);
		firstnameTB.sendKeys(fname);
		lastnameTB.sendKeys(lname);
		modifyTimeTrackCheckBox.click();
		manageCustomerAndProjectCheckBox.click();
		generateReportsCheckBox.click();
		manageUserCheckBox.click();
		manageBillingTypeCheckBox.click();
		Thread.sleep(1000);
		createUserButton.click();
	}
	
	
	
}
