package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/textbox.html");	//to lunch web application
		Thread.sleep(2000);
		//using reference variable
/*		WebElement textBox = driver.findElement(By.tagName("input"));	//find Password Textfield on the webpage.
		textBox.sendKeys("manager");  //to pass the inputs to password TextField.
		*/
		
		//or
		
		//using direct passing methods without variable
		driver.findElement(By.tagName("input")).sendKeys("manager");
	//Note: - inputs are passed to Username TextField because it is the 1st element designed with input tag.
	}

}
