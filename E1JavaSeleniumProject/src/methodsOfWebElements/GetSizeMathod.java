package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMathod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=aelt2915kpms8");
		
		WebElement userTB = driver.findElement(By.name("username"));
		Dimension size = userTB.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Username textbox height is: "+height+" "+"Width is: "+width);
		
		WebElement passwordTB= driver.findElement(By.name("pwd"));
		Dimension size1 = passwordTB.getSize();
		int height1 = size1.getHeight();
		int width1 = size1.getWidth();
		System.out.println("Password textbox height is: "+height1+" "+"Width is: "+width1);
		
	}

}
