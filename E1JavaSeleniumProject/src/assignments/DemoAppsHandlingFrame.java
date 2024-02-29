package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsHandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("username")).sendKeys("manisha");
		driver.findElement(By.id("password")).sendKeys("pass123");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
