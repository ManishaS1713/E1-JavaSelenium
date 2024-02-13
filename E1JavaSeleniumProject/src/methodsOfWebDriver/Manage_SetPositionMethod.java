package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//to pass x and y co-ordinate in class Point.
		Point targetPoint = new Point(200, 200);
		//to pass the co-ordinated to setPosition() method.
		driver.manage().window().setPosition(targetPoint);
	}

}
