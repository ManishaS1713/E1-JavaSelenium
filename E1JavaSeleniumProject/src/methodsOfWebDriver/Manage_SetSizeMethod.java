package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_SetSizeMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//to pass width and height to Dimension class which is taken from selenium not from jwt.
		Dimension targetSize = new Dimension(500, 200);	
		
		//to pass the dimensions to setSize() method.
		driver.manage().window().setSize(targetSize); 	
		
	}

}
