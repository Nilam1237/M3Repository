package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//To specify the path of excel file
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
	
         //To make the file ready to read
	     Workbook wb = WorkbookFactory.create(fis);
	     
	     Sheet sheet = wb.getSheet("IPL");
	
	      Row row = sheet.getRow(1);	
	      
	      Cell cell = row.getCell(1);
	      
	    String data = cell.getStringCellValue();
	    
	    System.out.println(data);
	    }
}
