package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions ac=new Actions(driver);
		
		WebElement web = driver.findElement(By.xpath("//section[text()='Web Elements']"));
		ac.click(web);		//click() method of Actions class
		driver.findElement(By.xpath("//section[text()='Button']")).click();  //click() method of WebElement
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		WebElement btn1 = driver.findElement(By.id("btn30"));
		ac.contextClick(btn1).perform();		//to perform right click operation
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		WebElement btn2 = driver.findElement(By.id("btn31"));
		ac.contextClick(btn2).perform();		//to perform right click operation
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		WebElement btn3 = driver.findElement(By.id("btn32"));
		ac.contextClick(btn3).perform();		//to perform right click operation
		driver.findElement(By.xpath("//div[text()='4']")).click();
	}

}
