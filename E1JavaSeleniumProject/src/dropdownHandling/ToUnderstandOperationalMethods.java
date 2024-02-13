package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/User/OneDrive/Desktop/WebElements/dropdownlist.html");
		
		WebElement multiDD = driver.findElement(By.id("skills"));
		
		Select sel=new Select(multiDD);
		boolean isMulti = sel.isMultiple();			//isMultiple()
		System.out.println(isMulti);
		System.out.println();
		
		
		List<WebElement> options = sel.getOptions();		//getOptions()
		System.out.println("options in multi list are: ");
		for(int i=0;i<options.size();i++)
		{
			String op = options.get(i).getText();
			System.out.println(op);
		}
		System.out.println();
		
		
		for(int i=2;i<4;i++)
		{
			sel.selectByIndex(i);
		}
		WebElement firstSelectedOption = sel.getFirstSelectedOption();				//firstSelectedOption()
		System.out.println("The first selected option is: "+firstSelectedOption.getText());
		System.out.println();
		
		
		List<WebElement> allSelectedOption = sel.getAllSelectedOptions();		//getAllSelectedOptions()
		System.out.println("All selected options: ");
		for(WebElement we : allSelectedOption)
		{
			System.out.println(we.getText());
		}
		System.out.println();
		
		WebElement wrappedElement = sel.getWrappedElement();		//getWrappedText()
		System.out.println("Wrapped ELement: "+wrappedElement.getText());

	}

}
