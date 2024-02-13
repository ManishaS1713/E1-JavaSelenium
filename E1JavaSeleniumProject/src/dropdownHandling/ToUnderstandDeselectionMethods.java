package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/dropdownlist.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("skills"));
		Select sel=new Select(multiSelectDD);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("s2");
		Thread.sleep(2000);
		sel.deselectByValue("s2");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("java");
		Thread.sleep(2000);
		sel.deselectByVisibleText("java");
		Thread.sleep(2000);
	}

}
