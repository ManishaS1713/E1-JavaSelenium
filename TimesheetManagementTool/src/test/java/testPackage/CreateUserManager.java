package testPackage;
import pagePackage.*;
import genericPackage.*;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;

@Listeners (CustomListner.class)
public class CreateUserManager extends BaseTest{
	@Test
	public  void createUserManagerTestCase() throws InterruptedException, IOException 
	{
		
		Flib flib=new Flib();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH,"password"));
		
		HomePage hp=new HomePage(driver);
		hp.getUserModule().click();
		Thread.sleep(1000);
		
		UserPage up=new UserPage(driver);
		up.getCreateNewUserButton().click();
		
		WorkLib wl=new WorkLib();
		int no=wl.randomNumber();
		
		String usn = flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 1);
		String fname = flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 2);
		String lname = flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 2);
		
		up.createNewUser(usn+no, pwd+no, fname+no, lname+no);
		
	}

}
