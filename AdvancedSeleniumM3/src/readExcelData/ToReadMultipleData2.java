package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./testData/testData");
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 
	}
}
