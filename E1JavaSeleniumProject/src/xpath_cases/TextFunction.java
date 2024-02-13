package xpath_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manisha-desktop-me32odq/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();	//used text() function.
		//or
		//driver.findElement(By.xpath("//a[.='Login']")).click();
		
	}

}
