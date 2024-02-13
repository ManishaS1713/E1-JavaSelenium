package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPurches {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dell laptop");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Dell' and @class=\"a-size-base a-color-base\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"low-price\"]")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@id=\"high-price\"]")).sendKeys("00000");
		driver.findElement(By.xpath("//input[@type=\"submit\" and @class=\"a-button-input\"]")).click();
		
		
	}

}
