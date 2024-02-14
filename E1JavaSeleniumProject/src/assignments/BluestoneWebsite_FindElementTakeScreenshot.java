package assignments;
/*
 * open bluestone.com
mouse hover cursor on coins- 24k 1g click on that- then 
check whether this element(image) is displayed or not and take screenshot of page
 */
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import com.google.common.io.Files;

public class BluestoneWebsite_FindElementTakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;	//explicitly typecast
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
		WebElement ele = driver.findElement(By.xpath("//a[@id='5920']"));
		Thread.sleep(5000);
		if(ele.isDisplayed())
		{
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshots/blustone.png");
			Files.copy(src, dest);
			
		}
		else
		{
			System.out.println("not found");
		}
	}

}
