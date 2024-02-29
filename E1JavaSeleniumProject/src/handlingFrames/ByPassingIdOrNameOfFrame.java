package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingIdOrNameOfFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//to switch the control by using id or name attribute of frame
		driver.switchTo().frame("send-sms-iframe");  
		
		//to perform operations on element designed inside frame
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9876543219");

	}

}
