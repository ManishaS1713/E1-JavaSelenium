package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Admin@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
		Thread.sleep(1000);
	}

}
