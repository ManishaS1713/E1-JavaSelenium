package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GoogleMapScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.google.com/");
		
		//click on google apps options
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/googleMap.png");
		 
		Files.copy( src, dest);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}

}
