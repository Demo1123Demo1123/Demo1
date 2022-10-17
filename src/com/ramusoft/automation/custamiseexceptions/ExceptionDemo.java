package com.ramusoft.automation.custamiseexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionDemo {
	
	public static void main(String[] args) {
		try
		{
		System.out.println("1");
		System.out.println("2");
		FileInputStream fis=new FileInputStream("D:\\Selenium_workspace\\New10amBatch1\\frameworks\\src\\com\\ramusoft\\automation\\appln\\testdata\\Textdata.xls");
		System.out.println("3");
		System.out.println("4");
		}
		catch(Exception exception){
			
			System.out.println("out ");
			
		}
		 
		
	}

}
