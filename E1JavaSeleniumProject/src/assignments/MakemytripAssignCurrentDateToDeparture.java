package assignments;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemytripAssignCurrentDateToDeparture {

	public static void main(String[] args) {
		
		LocalDateTime systemDate = LocalDateTime.now().plusMonths(7);
		String monthName = systemDate.getMonth().name();
		int day = systemDate.getDayOfMonth();
		int year = systemDate.getYear();
		
		String monthYear = monthName+" "+year;
		System.out.println(monthYear);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		
		while(true)
		{
			String text = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
		
			if(text.equalsIgnoreCase(monthYear))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
			
			driver.findElement(By.xpath("(//p[text()='"+day+"'])[2]")).click();
		
	}

}
