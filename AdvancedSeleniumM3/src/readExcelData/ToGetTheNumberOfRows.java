package readExcelData;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheNumberOfRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  //To Specify the path of excel file
		  FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		  //To make the file ready to read
	      Workbook wb = WorkbookFactory.create(fis);
	     
	      //To get into the desired sheet
	      Sheet sheet = wb.getSheet("IPL");
	
	      //to count the no of rows
	      int rc = sheet.getLastRowNum();	
	      
	      System.out.println(rc);
	}
}
