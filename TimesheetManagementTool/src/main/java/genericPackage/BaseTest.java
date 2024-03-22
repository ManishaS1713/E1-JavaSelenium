package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IAutoConstant {
	
	public static WebDriver driver; 	//declare and upcast globally
	
	@BeforeMethod
	//to open the browser setUp method use
	public void setUp() throws IOException
	{
		Flib flib=new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("invalid browser name!!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	
	@AfterMethod
	//to close the browser tearDown method use
	public void tearDown()
	{
		driver.quit();
	}
	
	
	public void failedMethodSS(String failedMethodVariable) 
	{
		//screenshot code
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+failedMethodVariable+".png");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}






