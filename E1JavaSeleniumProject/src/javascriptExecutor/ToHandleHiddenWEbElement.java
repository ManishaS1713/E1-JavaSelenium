package javascriptExecutor;

import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWEbElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='qspider'", hiddenElement);

	}

}
