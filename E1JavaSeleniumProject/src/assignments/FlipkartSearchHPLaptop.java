package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlipkartSearchHPLaptop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		
		//using findElements() method search the item from flipkart.
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='q']")));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		
		List<WebElement> laptopList = driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
		
		for(WebElement e : laptopList)
		{
			if(e.getText().contains("hp laptop"))
			{
				e.click();
				break;
			}
			
		}
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(1000);
		
		// Print laptop list along with price using xpath 
		List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@class=\"_4rR01T\" or @class='_30jeq3 _1_WHN1']"));
		
		for(WebElement e : laptopPrices)
		{
			System.out.println(e.getText());
		}
		
	}

}
