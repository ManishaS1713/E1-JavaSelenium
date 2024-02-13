package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");
		
		RemoteWebDriver remoteDriver=(RemoteWebDriver) driver;
		
		File src=remoteDriver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/flipkart.jpg");
		
		Files.copy(src, dest);
		driver.close();
	}

}
