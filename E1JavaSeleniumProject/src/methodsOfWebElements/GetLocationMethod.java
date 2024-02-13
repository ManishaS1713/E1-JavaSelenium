package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=aelt2915kpms8");
		
		WebElement userTB = driver.findElement(By.name("username"));
		Point location = userTB.getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println("x- "+x+" y- "+y);
	}

}
