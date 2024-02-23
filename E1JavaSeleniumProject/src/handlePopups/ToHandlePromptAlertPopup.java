package handlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		
		Alert promptArert = driver.switchTo().alert();
		
		System.out.println(promptArert.getText());
		Thread.sleep(2000);
		
		promptArert.sendKeys("My name is Manisha");
		Thread.sleep(2000);
		
		promptArert.accept();
	}

}
