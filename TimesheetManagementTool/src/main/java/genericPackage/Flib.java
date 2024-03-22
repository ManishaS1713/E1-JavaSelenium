package genericPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readPropertyData(String propPath, String key) throws IOException
	{
	
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
	
	public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		return data;
	}
	
	//
	public void writeExcelData(String excelPath,String sheetName,int rowNo, int cellNo, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	//this method is used 
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 int rowCount = sheet.getLastRowNum();
		return rowCount;
	}

}
