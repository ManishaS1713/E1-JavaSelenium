package testPackage;
import pagePackage.*;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;


@Listeners (CustomListner.class)
public class CreateNewCustomerAndProject extends BaseTest {
	@Test
	public void createNewCustomerAndProjectTestCase() throws IOException, EncryptedDocumentException, InterruptedException 
	{
		Flib flib=new Flib();
		
		//login to actTime
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp=new HomePage(driver);
		hp.getTasksModule().click();
		
		TasksPage tp=new TasksPage(driver);
		tp.createCustomerMethod(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0));
		tp.createProjectMethod(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0), flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 1));
		
		Thread.sleep(5000);
		tp.deleteAllCustomerAndProject();
		
		Thread.sleep(3000);
		hp.getLogoutLink();
		Thread.sleep(3000);
		
	}

}
