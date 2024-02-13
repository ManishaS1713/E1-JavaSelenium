package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/"); //to launch the web application
		
		driver.findElement(By.linkText("Open a popup window")).click();  //to open new(child) browser window
		Thread.sleep(1000);
		
		//close() method close parent window only and child window will be open
		//driver.close();
		
		//quit() method close both parent as well as child window
		driver.quit();
	}

}
