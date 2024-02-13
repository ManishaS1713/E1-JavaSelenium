package dropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/dropdownlist.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiSelectDD);
		List<WebElement> options = sel.getOptions();
		TreeSet<String> ts = new TreeSet<String>();		//TreeSet
		
		System.out.println("Duplicate elements are:- ");
		for(WebElement we : options)
		{
			System.out.println(we.getText());		//printing duplicate elements
			
			String textToString = we.getText();
			ts.add(textToString);
		}
	
		System.out.println("After Removing duplicate elements using TreeSet, the list is:- ");
		for(String s : ts)
		{
			System.out.println(s);			//printing unique elements
		}
		
	}

}
