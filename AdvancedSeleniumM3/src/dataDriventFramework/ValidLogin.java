package dataDriventFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ValidLogin{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Validlogincreds");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	
	//System.out.println(email);
	
	//to read password from excel sheet
	Cell  cell1 = row.getCell(1);
	String password = cell1.getStringCellValue();
	System.out.println(password);
	
	// To read url from Property File
	FileInputStream fis2 = new FileInputStream("./testData/config.properties");
	
	Properties prop = new Properties();
	prop.load(fis2);
	prop.getProperty("url");
	//System.out.println(url);
	
		
		
	}
}
