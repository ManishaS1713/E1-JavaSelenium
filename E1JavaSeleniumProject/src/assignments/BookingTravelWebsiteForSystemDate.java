package assignments;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingTravelWebsiteForSystemDate {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemDate = LocalDateTime.now();
		Month month = systemDate.getMonth();
		int year = systemDate.getYear();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.booking.com/");

		//to select flight
		driver.findElement(By.xpath("//span[text()='Flights']")).click();

		//to select one way route
		driver.findElement(By.xpath("//div[text()='One way']")).click();
		
		//to select "where from?"
		driver.findElement(By.xpath("//button[@class='css-1ovag24']")).click();
		driver.findElement(By.xpath("//span[@class='Icon-module__root___tiYlo css-lyj9ft Icon-module__root--size-small___UwcQH']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Airport or city']")).sendKeys("Pune International Airport");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='flights-searchbox_suggestions']")).click();
		
		//to select "where to?"
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='css-x72e3o ']")).sendKeys("Mumbai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='flights-searchbox_suggestions']")).click();
		
		//to select date from system
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
	}

}
