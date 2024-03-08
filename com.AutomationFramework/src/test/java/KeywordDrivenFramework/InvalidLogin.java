package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest1 bt = new BaseTest1();
		bt.setUp();
		
		Flib1 flib = new Flib1();
		
		int rowCount = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1; i<=rowCount; i++)
		{
			 String usnData = flib.readExcelData(EXCEL_PATH, "invalidcreds", i , 0);
			String pwdData = flib.readExcelData(EXCEL_PATH, "invalidcreds", i , 1);
			driver.findElement(By.name("username")).sendKeys(usnData);
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(pwdData);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}
		
		bt.tearDown();
	}

}
