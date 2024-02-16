package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		//to typecast into JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//To pass input to disabled textbox
		js.executeScript("document.getElementById('name').value='admin'");
		Thread.sleep(3000);

		//to clear the content from disabled textbox
		js.executeScript("document.getElementById('name').value='';");
		Thread.sleep(3000);
		
		//to pass input using arguments[0]
		WebElement disabledTextBox = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value='qspider'", disabledTextBox);
		
		//to pass input using arguments[0]
		WebElement disabledTextBox2 = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value=''", disabledTextBox2);
		Thread.sleep(5000);
		driver.close();
	}

}
