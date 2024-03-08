package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase1 extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest1 bt=new BaseTest1();
		bt.setUp();		//launch the browser
		Flib1 flib=new Flib1();
		String usn = flib.readPropertyData(PROP_PATH, "username");		//get username from config.properties file
		String pwd = flib.readPropertyData(PROP_PATH, "password");		//get password from config.properties file
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();;
		Thread.sleep(5000);
		bt.tearDown();		//quit the browser
	}

}
