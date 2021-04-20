package day_23_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_Excel {

	public String getData(String sheetName, int rowNum, int cellNum) {
		String retVal=null;
		
		try {
			FileInputStream fs = new FileInputStream("F:\\Software Testing\\Selenium\\WorkBooks\\Login.xlsx");
			try {
				Workbook wb = WorkbookFactory.create(fs);
				Sheet s = wb.getSheet(sheetName);
				Row r = s.getRow(rowNum);
				Cell c = r.getCell(cellNum);
				retVal =c.getStringCellValue();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
	
	public int getRowNum(String sheetName) {
		int retVal=0;
		try {
			FileInputStream fs = new FileInputStream("F:\\Software Testing\\Selenium\\WorkBooks\\Login.xlsx");
			try {
				Workbook wb = WorkbookFactory.create(fs);
				Sheet s = wb.getSheet(sheetName);
				retVal= s.getLastRowNum();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
}
