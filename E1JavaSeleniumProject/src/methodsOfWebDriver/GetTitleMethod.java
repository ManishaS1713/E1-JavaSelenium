package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
