package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(1000);
		
		 List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		 for(int i=0; i<bikeOptions.size();i++)
		 {
			 String ops = bikeOptions.get(i).getText();
			 System.out.println(ops);
			 Thread.sleep(1000);
		 }
		 
		 for(WebElement we : bikeOptions)
		 {
			 String options=we.getText();
			 System.out.println(options);
			 Thread.sleep(1000);
			 
		 }
	}
	
}
