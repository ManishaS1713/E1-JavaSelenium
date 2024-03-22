package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerLink;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	@FindBy(name = "name")
	private WebElement customerNameTb;
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerButton;
	@FindBy(xpath = "//input[contains(@value, ' Cancel')]")
	private WebElement customerCancelButton;

	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createNewProjectButton;
	@FindBy(name = "customerId")
	private WebElement selectCustomerDropdown;
	@FindBy(name = "name")
	private WebElement projectNameTb;
	@FindBy(xpath = "//input[@value='Create Project']")
	private WebElement createProjectButton;
	@FindBy(xpath = "//input[contains(@value, ' Cancel')]")
	private WebElement projectCancelButton;

	@FindBy(linkText = "All")
	private WebElement allCustomerAndProjectLink;
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;
	@FindBy(xpath = "//input[@value='Archive Selected']")
	private WebElement archiveSelectedButton;

	@FindBy(id = "deleteButton")
	private WebElement deleteThisCustomerPopupButton;

	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjectAndCustomerLink() {
		return projectAndCustomerLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCustomerNameTb() {
		return customerNameTb;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomerCancelButton() {
		return customerCancelButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getProjectNameTb() {
		return projectNameTb;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public WebElement getProjectCancelButton() {
		return projectCancelButton;
	}

	public WebElement getAllCustomerAndProjectLink() {
		return allCustomerAndProjectLink;
	}

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getArchiveSelectedButton() {
		return archiveSelectedButton;
	}

	public WebElement getDeleteThisCustomerPopupButton() {
		return deleteThisCustomerPopupButton;
	}

	public void createCustomerMethod(String customerName) throws InterruptedException {
		Thread.sleep(1000);
		projectAndCustomerLink.click();

		createNewCustomerButton.click();

		customerNameTb.sendKeys(customerName);
		createCustomerButton.click();
	}

	public void createProjectMethod(String customerName, String projectName) throws InterruptedException {
		Thread.sleep(1000);
		projectAndCustomerLink.click();

		createNewProjectButton.click();

		Select sel = new Select(selectCustomerDropdown);
		sel.selectByVisibleText(customerName);
		projectNameTb.sendKeys(projectName);
		createProjectButton.click();

	}

	public void deleteAllCustomerAndProject() throws InterruptedException {
		Thread.sleep(1000);
		projectAndCustomerLink.click();
		allCustomerAndProjectLink.click();
		deleteSelectedButton.click();
		deleteThisCustomerPopupButton.click();
	}

}
