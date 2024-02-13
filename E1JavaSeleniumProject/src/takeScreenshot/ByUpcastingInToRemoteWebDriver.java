package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingInToRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.co.in");
		
		File scr=driver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/amazon.png");
		
		Files.copy(scr, dest);
		
		driver.close();
	}

}
