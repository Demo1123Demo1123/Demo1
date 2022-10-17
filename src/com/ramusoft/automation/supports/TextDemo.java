package com.ramusoft.automation.supports;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


import com.google.common.io.FileWriteMode;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class TextDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Selenium_workspace\\New10amBatch\\frameworks\\src\\com\\ramusoft\\automation\\supports\\demo.txt");	
	boolean	Status=file.createNewFile();
	if (Status) {
		
		System.out.println("file is created ");
	}
	else {
		System.out.println("Retuning exixting file!");
	}
	
	FileReader filereader =new  FileReader(file);
	BufferedReader bufferreader=new BufferedReader(filereader);
	while (bufferreader.ready()) {
		
	String data = bufferreader.readLine();
	System.out.println(data);
	
	}
	
	
	
	  FileWriter fw= new FileWriter(file ,true);
	  //FileWriter fw= newFileWriter(file );
	  BufferedWriter bw= new BufferedWriter(fw);
	  bw.write("Ramu"); 
	  bw.newLine();
	  bw.write("java");
	  bw.newLine();
	  bw.write("selenium");
	  bw.newLine(); 
	  bw.flush();
	 
	
	}

}
