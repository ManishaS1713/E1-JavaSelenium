package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); //to launch the Chrome browser
		Thread.sleep(5000); //pause or stop the execution
		driver.close(); //to close the browser window
	}

}
