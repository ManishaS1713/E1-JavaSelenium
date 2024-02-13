package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twiter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")).sendKeys("manisha");
		
		driver.findElement(By.xpath("//input[@name='text' and  @type='text']")).sendKeys("manisha");
		/*Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("123pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div/span")).click();*/
	}

}
