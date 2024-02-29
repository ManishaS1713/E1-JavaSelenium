package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingParentFrameMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
			
		driver.findElement(By.id("denyBtn")).click();
		
		driver.switchTo().frame("fc_widget");
		driver.findElement(By.id("chat-icon")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("Manisha");
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("mgshinde17@gmail.com");
	}

}
