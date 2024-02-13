package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		String source=driver.getPageSource();
		System.out.println(source);
	}

}
