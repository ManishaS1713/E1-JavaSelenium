package xpath_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"emailId\"]")).sendKeys("mgshinde17@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"mui-2\"]")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
