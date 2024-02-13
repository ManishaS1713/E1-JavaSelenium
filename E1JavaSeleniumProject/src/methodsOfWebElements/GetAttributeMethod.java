package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=aelt2915kpms8");
		
		WebElement passwordTB= driver.findElement(By.name("pwd"));
		String attributeValue=passwordTB.getAttribute("class");
		System.out.println(attributeValue);
		
		
	}

}
