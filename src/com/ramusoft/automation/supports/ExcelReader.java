package com.ramusoft.automation.supports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	private String filepath;
	private FileInputStream fio;
	private Workbook workbook ;
	private Sheet sheet;
	private Row	row;
	private Cell cell;
	private String cellvalue ;
	
	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		
		this.filepath = filepath;
		fio = new FileInputStream(filepath);
		workbook=WorkbookFactory.create(fio);
		
	}
	public  Sheet getsheetobj(String how,String howValue) {
		
		if (workbook!= null) {
			if (how.equalsIgnoreCase("Sheetname")) {
			sheet=workbook.getSheet(howValue);
			
			}
			else if (how.equalsIgnoreCase("index")) {
				
				int index=Integer.parseInt(howValue);
				sheet=workbook.getSheetAt(0);
			}
		}
		else {
			
			System.out.println("workbook is pointing to null");
			
		}
		return sheet;			
	}
	public int getRowscountfromSheet(String how,String howvalue) {
		sheet = getsheetobj(how, howvalue);
		int rowcount=0;
		
		if (sheet!=null) {
			
			rowcount =sheet.getLastRowNum();
		}
		else {
			System.out.println("sheet is pointing to null");
		}
		return rowcount;

	}
	public int getCellscountfromSheet(String how,String howvalue,int rowNum) {
		sheet = getsheetobj(how, howvalue);
		int cellcount=0;
		
		if (sheet!=null) {
			
		row =sheet.getRow(rowNum);
		cellcount=row.getLastCellNum();	
		
		}
		else {
			System.out.println("sheet is pointing to null");
		}
		return cellcount;

	}
	public String getCellData(String how,String howValue,int rowNum,int cellNum) {
		sheet = getsheetobj(how, howValue);
		cell=sheet.getRow(rowNum).getCell(cellNum);
		if (cell.getCellType()==CellType.STRING) {
			cellvalue=cell.getStringCellValue();	
		}
		else if (cell.getCellType()==CellType.NUMERIC) {
			cellvalue=cell.getNumericCellValue()+"";	
		}
		else if (cell.getCellType()==CellType.BOOLEAN) {
			cellvalue=cell.getBooleanCellValue()+"";	
		}
		return cellvalue;

	}
	public List<String>getrowData(String how,String howValue,int rownum ) {
		List<String> rowdata= new ArrayList<String>();
		sheet=getsheetobj(how, howValue);
		row =sheet.getRow(rownum);
		if (row!=null) {
			for (int i = 0; i < row.getLastCellNum(); i++) {
				
				cell=row.getCell(i);
				if (cell.getCellType()==CellType.STRING) {
					cellvalue=cell.getStringCellValue();
					rowdata.add(cellvalue);
				}
				else if (cell.getCellType()==CellType.NUMERIC) {
					cellvalue=cell.getNumericCellValue()+"";
					rowdata.add(cellvalue);
				}
				else if (cell.getCellType()==CellType.BOOLEAN) {
					cellvalue=cell.getBooleanCellValue()+"";
					rowdata.add(cellvalue);
				}
				
			}
		}
		else {
			System.out.println("row is printing to null");
		}
		return rowdata;
		

	}
	public List<String> getsheetdata(String how,String howValue) {
		
		List<String>Sheetdata=new ArrayList<String>();
		sheet=getsheetobj(how, howValue);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			row =sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				cell =row.getCell(j);
				if (cell.getCellType()==CellType.STRING) {
					cellvalue=cell.getStringCellValue();
					Sheetdata.add(cellvalue);
				}
				else if (cell.getCellType()==CellType.NUMERIC) {
					cellvalue=cell.getNumericCellValue()+"";
					Sheetdata.add(cellvalue);
				}
				else if (cell.getCellType()==CellType.BOOLEAN) {
					cellvalue=cell.getBooleanCellValue()+"";
					Sheetdata.add(cellvalue);
				}
			}
		}
		return Sheetdata;

	}
	public Set<String> getUniquesheetdata(String how,String howValue ) {
	
		List<String> listSheetdata = getsheetdata(how, howValue);
		Set<String> setsheetdata = new HashSet<String>(listSheetdata);
		return setsheetdata;
		

	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelReader excelreader = new ExcelReader("D://Textdata.xls");
		excelreader.getsheetobj("Sheetname", "RK");
		
	}
}
