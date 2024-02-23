package handlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		//to generate alert popup
		driver.findElement(By.id("alert")).click();
		
		//to switch the control to alert popup
		Alert alertPopup = driver.switchTo().alert();
		
		//to click on ok button
		alertPopup.accept();
	}

}
