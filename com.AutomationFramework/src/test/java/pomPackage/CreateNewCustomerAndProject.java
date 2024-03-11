package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewCustomerAndProject extends BaseTest1 {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest1 bt=new BaseTest1();
		bt.setUp();
		Flib1 flib=new Flib1();
		
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
		bt.tearDown();
	}

}
