package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Load the Website
		driver.get("https://omayo.blogspot.com/");

			driver.getWindowHandle(); //to get the address of parent window
	        String parentTitle = driver.getTitle();  //to get the title of parent window
	        
	        driver.findElement(By.partialLinkText("Open a popup window")).click();
	        Thread.sleep(2000);
	        
	        // to get address of all windows
	        Set<String> allWindows = driver.getWindowHandles(); 
	  
	        // for each loop 
	        for (String wh : allWindows) { 
	            // iterate and switch control 
	          String title = driver.switchTo().window(wh).getTitle(); 
	          
	          if(!title.equals(parentTitle)) //to compare the titles
	          {
	        	  driver.close();
	          }
	        } 
	}

}
