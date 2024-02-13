package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateElementUsingHashSet {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/dropdownlist.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiSelectDD);
		List<WebElement> options = sel.getOptions();
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0;i<options.size();i++)
		{
			String op = options.get(i).getText();
			hs.add(op);
		}
		
		System.out.println("Unique elements using hashSet:- ");
		for(String text: hs)
		{
			System.out.println(text);
		}
	}

}
