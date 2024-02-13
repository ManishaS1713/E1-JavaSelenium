package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp_DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement dateDD = driver.findElement(By.id("day"));
		Select date=new Select(dateDD);
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month=new Select(monthDD);
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year=new Select(yearDD);
		
		// check is it multi select or single select
		System.out.println("Is Date Dropdown multiple? "+date.isMultiple());
		System.out.println("Is Month Dropdown multiple? "+month.isMultiple());
		System.out.println("Is Year Dropdown multiple? "+year.isMultiple());
		
		/*if(date.isMultiple())
		{
			System.out.println("Date Is Multiple select DD");
		}
		else
		{
			System.out.println("Date Is Single select DD");
		}
		System.out.println("------------------------------------------------------------------");

		if(month.isMultiple())
		{
			System.out.println("Month Is Multiple select DD");
		}
		else
		{
			System.out.println("Month Is Single select DD");
		}
		System.out.println("------------------------------------------------------------------");

		if(year.isMultiple())
		{
			System.out.println("Year Is Multiple select DD");
		}
		else
		{
			System.out.println("Year Is Single select DD");
		}
		System.out.println("------------------------------------------------------------------");
*/
		//print all options
		List<WebElement> day = date.getOptions();
		for(WebElement we : day)
		{
			System.out.println(we.getText());
		}
		System.out.println("------------------------------------------------------------------");

		List<WebElement> months = month.getOptions();
		for(WebElement we : months)
		{
			System.out.println(we.getText());
		}
		System.out.println("------------------------------------------------------------------");

		List<WebElement> years = year.getOptions();
		for(WebElement we : years)
		{
			System.out.println(we.getText());
		}
		System.out.println("------------------------------------------------------------------");
		
		
		//select your birthdate
		date.selectByIndex(16);
		month.selectByValue("8");
		year.selectByVisibleText("1988");

	}

}
