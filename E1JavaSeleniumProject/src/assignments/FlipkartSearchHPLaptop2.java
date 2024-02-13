package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchHPLaptop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//using findElement() method search the item from flipkart.
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]")).click();
		Thread.sleep(1000);
		
		//filter processor
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(1000);
		
		//filter operating system
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(1000);
		
		//filter brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(1000);
		
		// Print laptop list along with price using xpath and print the o/p using nested for loop
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<laptops.size();i++)
		{
			String lapy=laptops.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String price=laptopPrices.get(i).getText();
				System.out.println(j+" "+lapy+" "+price);
			}
			System.out.println();
		}
		
		driver.close();

	}

}
