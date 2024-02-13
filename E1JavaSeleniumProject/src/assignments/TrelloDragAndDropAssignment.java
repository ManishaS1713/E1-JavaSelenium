package assignments;
/*
 * Trello.com website then  login to it

Manual work-
on top 'create button' click on it
click create button

create four title- mock details(add crad- sql,manual testing, api, java, selenium), mock given, mock pending, mock schedule.

drag and drop card from mock details to its respective title.

 * 
 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/u/manishashinde8/boards");
		
		driver.findElement(By.xpath("//a[text()='logging in']")).click();
		driver.findElement(By.id("user")).sendKeys("mgshinde17@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Trello@1713");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()='My Trello board']")).click();
		
		Thread.sleep(5000);
		WebElement sqlSource = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement javaSource = driver.findElement(By.xpath("//a[text()='Java']"));
		WebElement manualTestingSource = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement seleniumSource = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement apiScource = driver.findElement(By.xpath("//a[text()='API']"));
		
		WebElement mockGivenTarget = driver.findElement(By.xpath("//textarea[text()='mock given']"));
		WebElement mockPendingTarget = driver.findElement(By.xpath("//textarea[text()='mock pending']"));
		WebElement mockScheduleTarget = driver.findElement(By.xpath("//textarea[text()='mock schedule']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(sqlSource, mockPendingTarget).perform();
		act.dragAndDrop(javaSource, mockGivenTarget).perform();
		act.dragAndDrop(manualTestingSource, mockGivenTarget).perform();
		act.dragAndDrop(seleniumSource, mockScheduleTarget).perform();
		act.dragAndDrop(apiScource, mockGivenTarget).perform();
		
		/*
		 * if right click some option is there and inspect all element using for loop print all element on console 
		 */
		act.contextClick(seleniumSource).perform();
		List<WebElement> list = driver.findElements(By.xpath("//button[@class=\"BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc\"]"));
		for(WebElement we : list)
		{
			System.out.println(we.getText());
		}
		
		list.get(0).click();
		driver.findElement(By.xpath("//span[@aria-label='Color: blue, title: none']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"css-1wits42\"])[2]")).click();
		
		list.get(2).click();
		driver.findElement(By.xpath("(//button[@class='button nVakQfqceU1iBZ xbqz5Yq04rXWyu'])[3]")).click();
		
	}

}
