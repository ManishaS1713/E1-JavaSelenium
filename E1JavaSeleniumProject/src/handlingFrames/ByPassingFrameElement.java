package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
			
		//to identify the frame by using xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		//to pass the reference of frame element
		driver.switchTo().frame(frameElement);
		
		//to perform operations on element designed inside frame
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9876543219");

	}

}
