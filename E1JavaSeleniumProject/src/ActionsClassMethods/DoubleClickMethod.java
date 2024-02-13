package ActionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions ac=new Actions(driver);
		
		WebElement web = driver.findElement(By.xpath("//section[text()='Web Elements']"));
		ac.click(web);		//click() method of Actions class
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click(); //click() method of WebElement
		
		Actions act=new Actions(driver);		//create object of Actions class
		
		WebElement yesButton = driver.findElement(By.id("btn20"));
		act.doubleClick(yesButton).perform();		// To perform double click operation on yes button
		WebElement noButton = driver.findElement(By.id("btn23"));
		act.doubleClick(noButton).perform();		// To perform double click operation on no button
		WebElement ratingButton = driver.findElement(By.id("btn26"));
		act.doubleClick(ratingButton).perform();	// To perform double click operation on rating button

	}

}
