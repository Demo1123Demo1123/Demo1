package com.ramusoft.automatio.utilitis;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.ramusoft.automation.supports.ExcelReader;
import com.ramusoft.automation.supports.PropertiesReader;
import com.ramusoft.automation.supports.TextReader;

public class PojoUtility {
	
	public static PropertiesReader getconfigobj() throws IOException
	{
		PropertiesReader propertiesconfig=new PropertiesReader(Filepath.configpath);
		return propertiesconfig;
	}
	public static PropertiesReader getorobj() throws IOException
	{
		PropertiesReader propertiesor=new PropertiesReader(Filepath.orpath);
		return propertiesor;
	}
	
	public static ExcelReader getsheetobj() throws EncryptedDocumentException, IOException
	{
		ExcelReader exr=new ExcelReader(Filepath.excelpath);
		return exr;
		
	}
	public static TextReader getTextobj() throws IOException {
		
		TextReader textreader=new TextReader(Filepath.txtpath);
		return textreader;
	}
}
