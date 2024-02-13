package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/dropdownlist.html");
		
		
		WebElement singleSelectDD = driver.findElement(By.id("skills"));
		Select sel=new Select(singleSelectDD);
		
		sel.selectByIndex(3);		//selectByIndex()
		Thread.sleep(2000);
		
		sel.selectByValue("s5");			//selectByValue()
		Thread.sleep(2000);
		
		sel.selectByVisibleText("TestNG");			//selectByVisibleText()
	}

}
