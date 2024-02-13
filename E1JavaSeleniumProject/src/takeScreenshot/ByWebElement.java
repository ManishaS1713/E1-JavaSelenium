package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com");
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File src=loginButton.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/instaLoginBtn.png");
		
		Files.copy(src, dest);
		driver.close();
	}

}
