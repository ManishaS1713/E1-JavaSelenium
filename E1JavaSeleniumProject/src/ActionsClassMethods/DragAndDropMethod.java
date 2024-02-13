package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		
		//find source element
		WebElement mobileChargerSource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement laptopChargerScource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laptopCoverSource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//find target element
		WebElement mobileAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		//create object of an Actions class
		Actions act=new Actions(driver);
		
		//use dragAndDrop() method to drag from source to paste it in target 
		act.dragAndDrop(mobileCoverSource, mobileAccessoriesTarget).perform();
		act.dragAndDrop(mobileChargerSource, mobileAccessoriesTarget).perform();
		act.dragAndDrop(laptopCoverSource, laptopAccessoriesTarget).perform();
		act.dragAndDrop(laptopChargerScource, laptopAccessoriesTarget).perform();
		
	}

}
