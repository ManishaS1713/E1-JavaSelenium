package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		//to find element to be click and hold
		WebElement clickAndHold = driver.findElement(By.id("circle"));
		
		//create the object of action class
		Actions act=new Actions(driver);
		
		//to perform click and hold operation
		act.clickAndHold(clickAndHold).perform();
		Thread.sleep(5000);
		
		//to release the hold element
		act.release(clickAndHold);
	}

}
