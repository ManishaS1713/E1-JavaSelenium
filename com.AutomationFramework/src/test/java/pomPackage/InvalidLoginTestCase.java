package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest1 {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest1 bt=new BaseTest1();
		bt.setUp();
		Flib1 flib=new Flib1();
		
		LoginPage lp=new LoginPage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
		
	}

}
