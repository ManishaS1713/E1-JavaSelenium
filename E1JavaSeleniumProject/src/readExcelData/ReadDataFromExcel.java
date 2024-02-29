package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to specify the path of the excel file
		FileInputStream fis=new FileInputStream("./data/testData.xlsx");
		
		//to make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
	}

}
