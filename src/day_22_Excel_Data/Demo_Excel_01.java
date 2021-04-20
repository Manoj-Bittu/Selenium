package day_22_Excel_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_Excel_01 {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("F:\\Software Testing\\Selenium\\WorkBooks\\login.xlsx");
			try {
				Workbook wb = WorkbookFactory.create(fs);
				Sheet s = wb.getSheetAt(0);
				Row r = s.getRow(1);
				Cell c = r.getCell(0);
				String txt = c.getStringCellValue();
				System.out.println(txt);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
