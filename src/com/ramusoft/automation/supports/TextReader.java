package com.ramusoft.automation.supports;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.FileWriteMode;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class TextReader {
	
	private String filepath;
	private File file;
	private FileReader filereader;
	private BufferedReader bufferreader;
	private FileWriter fw;
	private BufferedWriter bw;
	public TextReader(String filepath) throws IOException
	{
		this.filepath=filepath;
		file = new File(filepath);	
		boolean	Status=file.createNewFile();
		if (Status) {
			
			System.out.println("file is created ");
		}
		else {
			System.out.println("Retuning exixting file!");
		}
		
		filereader =new  FileReader(file);
		bufferreader=new BufferedReader(filereader);
		fw= new FileWriter(file ,true);
		  //FileWriter fw= newFileWriter(file );
		bw= new BufferedWriter(fw);
		
	}
	public void Writedata(String data) throws IOException {
		
		if (bw!=null) {
			
			bw.write(data);
			bw.flush();
		}
		else {
			System.out.println("String data is fail");
		}
	}
	public void Writedata(int data) throws IOException {
		
		if (bw!=null) {
			
			bw.write(data);
			bw.flush();
		}
		else {
			System.out.println("int data is fail");
		}
	}
	public void Writedata(List<String> data) throws IOException {
		
		if (bw!=null) {
			for(String str : data) {
				bw.write(str);
				bw.flush();
			}
			
		}
		else {
			System.out.println("String data is fail");
		}
	}
	public List<String> getTotalfiledata() throws IOException {
		
		List<String>filedata= new ArrayList<String>();
		if (bufferreader!=null) {
			while (bufferreader.ready()) {
				
				String readdata=bufferreader.readLine();
				filedata.add(readdata);
			}
			
		}
		else {
			
			System.out.println("file data is fail");
		}
		return filedata;

	}
}
