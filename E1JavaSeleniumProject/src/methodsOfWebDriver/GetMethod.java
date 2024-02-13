package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); // to launch the chrome browser
		
		driver.get("https://www.flipkart.com/"); //to launch the application or website
	
	}
}
