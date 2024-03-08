package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		WebElement usn = driver.findElement(By.name("uaername"));
		//usn.findElement("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		//pwd.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		usn.sendKeys("admin");
	}

}
