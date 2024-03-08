package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

//declaration
	@FindBy(xpath = "//div[text()='Time-Track']/ancestor ::a/descendant::img") private WebElement timeTrackModule;
	@FindBy(xpath = "//div[text()='Tasks']/ancestor :: a /descendant :: img") private WebElement tasksModule;
	@FindBy(xpath = "//div[text()='Reports']/ following-sibling :: img") private WebElement reportsModule;
	@FindBy(xpath = "//div[text()='Users']/following-sibling ::img") private WebElement userModule;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling ::img") private WebElement workScheduleModule;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling ::img") private WebDriver settingModule;
	@FindBy(partialLinkText = "Logout") private WebElement logoutLink;
	
//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

//utilization
	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTasksModule() {
		return tasksModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
		
}
