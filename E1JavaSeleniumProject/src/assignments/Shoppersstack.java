package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class=\"navbar_Loginbutton__8r9bE\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("mgshinde");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='MuiButton-label']")).click();

	}

}
