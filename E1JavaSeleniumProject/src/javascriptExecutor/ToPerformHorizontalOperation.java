package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToPerformHorizontalOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(2000);
		
		driver.close();
	}

}
