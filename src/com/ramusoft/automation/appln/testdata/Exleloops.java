package com.ramusoft.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exleloops {

	public static void main(String[] args) throws EncryptedDocumentException,InvalidFormatException, IOException {
		
		
		FileInputStream fio=new FileInputStream("D:\\Selenium_workspace\\New10amBatch\\frameworks\\src\\com\\ramusoft\\automation\\appln\\testdata\\Textdata.xls");
		
		Workbook workbook=  WorkbookFactory.create(fio);
		Sheet sheet= workbook.getSheet("RK");
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			
			Row row=sheet.getRow(i);
			
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				Cell cell=row.getCell(j);
				
				if (cell.getCellType() == CellType.STRING) {
					String cellvalue=cell.getStringCellValue();
					System.out.println(cellvalue);
				}
				else if (cell.getCellType() == CellType.NUMERIC) {
					double cellvalue=cell.getNumericCellValue();
					System.out.println(cellvalue);
				}
				else if (cell.getCellType() == CellType.BOOLEAN) {
					boolean cellvalue=cell.getBooleanCellValue();
					System.out.println(cellvalue);
				}
			}
			
		}
		
	}

}
