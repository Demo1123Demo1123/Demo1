package com.ramusoft.automation.appln.testdata;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	
	public static void main(String[] args) throws EncryptedDocumentException,InvalidFormatException, IOException  {
		
		/*
		 * File file=new File(
		 * "D:\\Selenium_workspace\\New10amBatch\\frameworks\\src\\com\\ramusoft\\automation\\appln\\testdata\\Textdata.xlsx"
		 * ); FileInputStream fis=new FileInputStream(file);
		 */
		
		FileInputStream fis= new FileInputStream("D:\\Selenium_workspace\\New10amBatch\\frameworks\\src\\com\\ramusoft\\automation\\appln\\testdata\\Textdata.xls");
		
		Workbook work =	WorkbookFactory.create(fis);
		//Sheet sheet= work.getSheetAt(0);
		Sheet sheet= work.getSheet("RK");
		//System.out.println("Print Sheet numbers:"+sheet);
		
		int totalrows=sheet.getLastRowNum();
		System.out.println("Print total rows:"+totalrows);
		
		Row row=sheet.getRow(0);
		
		int totalnumberofcell=row.getLastCellNum();
		System.out.println("print total number of cells:"+totalnumberofcell);
		
		Cell cell00=row.getCell(0);
		String cellvalue=cell00.getStringCellValue();
		System.out.println(cellvalue);
		
		Cell cell01=row.getCell(1);
		String cellvalue01=cell01.getStringCellValue();
		System.out.println(cellvalue01);
		
		Cell cell02=row.getCell(2);
		String cellvalue02=cell01.getStringCellValue();
		System.out.println(cellvalue02);
	
		Row row1=sheet.getRow(1);
		Cell cell=row1.getCell(0);
		String cellvalue1=cell.getStringCellValue();
		System.out.println(cellvalue1);
		
		Cell cell1=row1.getCell(1);
		String cellvalue11=cell1.getStringCellValue();
		System.out.println(cellvalue11);
		
		Row row2=sheet.getRow(2);
		Cell cell2=row2.getCell(0);
		String cellvalue12=cell2.getStringCellValue();
		System.out.println(cellvalue12);
		
		Cell cell23=row2.getCell(1);
		String cellvalue123=cell23.getStringCellValue();
		System.out.println(cellvalue123);
	}

}
