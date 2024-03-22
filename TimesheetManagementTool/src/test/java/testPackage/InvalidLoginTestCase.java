package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners (CustomListner.class)
public class InvalidLoginTestCase extends BaseTest {
	@Test
	public void invalidLoginTC() throws IOException, EncryptedDocumentException, InterruptedException 
	{
		
		Flib flib=new Flib();
		
		LoginPage lp=new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
		
	}

}
