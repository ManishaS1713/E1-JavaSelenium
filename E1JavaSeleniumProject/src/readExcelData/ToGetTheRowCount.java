package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testData.xlsx"); //path of the excel file
		 Workbook wb = WorkbookFactory.create(fis);//make file ready to read
		 Sheet sheet = wb.getSheet("invalidcreds"); //to get into the sheet
		 int rc = sheet.getLastRowNum(); //to get the no. of rows
		 
		 System.out.println(rc);
		
	}

}
