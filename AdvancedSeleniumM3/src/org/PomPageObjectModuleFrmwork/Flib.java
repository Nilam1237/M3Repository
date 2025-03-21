package org.PomPageObjectModuleFrmwork;

public class Flib {
	
	//To fetch/read the data from Excel file
		public String readExcelData(String excelPath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String data = cell.toString();
			return data;
		}
		
		//To fetch/read the data from Property file
		public String readPropertyData(String proPath, String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(proPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
		}
		
		//To count the rows in the excel sheet
		public int lastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			return rowCount;
		}
	}

}
