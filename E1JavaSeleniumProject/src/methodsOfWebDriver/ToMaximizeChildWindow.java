package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String wh : allWindows)
		{
			String title = driver.switchTo().window(wh).getTitle();
			
			if(title.endsWith("New Window"))
			{
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.manage().window().minimize();
				Thread.sleep(2000);
				
			}
		}
		driver.close(); //close() close only child window but quit() will close both parent and child
	}

}
