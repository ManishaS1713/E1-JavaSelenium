package handlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("confirm")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(confirmationAlert.getText());
		
		confirmationAlert.accept();
	}

}
