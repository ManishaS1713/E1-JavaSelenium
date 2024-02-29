package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingIndexOfFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//to switch the control to frame using frame index
		driver.switchTo().frame(0);
		
		//to perform operations on element designed inside frame
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9876543219");
	}

}
