package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     //To Specify the path of excel file
					FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
					
					 //To make the file ready to read
				     Workbook wb = WorkbookFactory.create(fis);
				     
				     //to get into the desired sheet
				     Sheet sheet = wb.getSheet("IPL");
				     
				     Row row = sheet.createRow(10);
				     
				     Cell cell = row.createCell(0);
				     
				     cell.setCellValue("Punjab_Kings");
				     
				     FileOutputStream fos = new FileOutputStream("./testData/testData.xlsx");
				    // To write the data into excel
				     wb.write(fos);
	}
}
