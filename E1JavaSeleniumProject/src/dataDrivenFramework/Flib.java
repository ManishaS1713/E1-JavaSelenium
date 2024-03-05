package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//this class is used to store all the generic reusable methods
	//all methods are non static methods
	
	//this method is used to read the data from excel file
	public String readExcelData(String excelPath,String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// to provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
		Row row = sheet.getRow(rowNo); //to get into the desired cell
		Cell cell = row.getCell(cellNo); //to read the data from 
		String data = cell.getStringCellValue();
		return data;
	}
	//this method is used to get number of rows from a particular sheet
	public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);// to provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);// to get into the desired sheet
		int rowCount = sheet.getLastRowNum();//to get the no. of rows
		return rowCount;
	}
	
	//this method is used to write the data into excel file
	public void writeExcelData(String excelPath,String sheetName,int rowNo,int cellNo, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}

}
