package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//to find the Username textbox and pass the input in it.
		driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("ManishaS1713");
		// ^= match starting character of attribute_value
		//driver.findElement(By.cssSelector("input[aria-label^='Ph']")).sendKeys("ManishaS1713");
		Thread.sleep(1000);
		
		//to find the Password textbox and pass the input in it.
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("Password@123");
		// $= match ending character of attribute_value
		//driver.findElement(By.cssSelector("input[type$='d']")).sendKeys("ManishaS1713");
		Thread.sleep(1000);
		
		//to click on login button.
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// *= match any character of attribute_value
		//driver.findElement(By.cssSelector("button[type*='bm']")).click();
	}

}
