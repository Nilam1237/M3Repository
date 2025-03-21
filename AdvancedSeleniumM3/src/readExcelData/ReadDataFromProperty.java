package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//To Specify the location of the file
		FileInputStream fis = new FileInputStream("./testData/Config.Properties");
	    
	    //to make the file ready to read
		Properties prop = new Properties();
	    prop.load(fis);
	   
	    //To read the data from property file
	   // String data = prop.getProperty("username");
	    String data = prop.getProperty("password"); 
         System.out.println(data);	
	}
}
