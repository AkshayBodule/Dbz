package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_data_from_excel {

	public static void readData() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Personal_Framework\\TestData\\ups.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		excel.getRow(0).getCell(0).getStringCellValue();	
	}
}
