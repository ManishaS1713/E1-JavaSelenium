package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1;i<10;i++)
		{
		FileInputStream fis=new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.getRow(i);
		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);
		 String data1 = cell1.getStringCellValue();
		 String data2 = cell2.getStringCellValue();
		 System.out.println(data1+"=>"+data2);
		 
		}
	}

}
