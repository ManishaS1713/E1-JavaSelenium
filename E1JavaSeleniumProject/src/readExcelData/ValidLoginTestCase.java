package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		
		//to get username from excel
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(0);
		String usnData = cell1.getStringCellValue();
		//to get password from excel
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		String pwdData = cell2.getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		driver.findElement(By.name("username")).sendKeys(usnData);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
	}

}
