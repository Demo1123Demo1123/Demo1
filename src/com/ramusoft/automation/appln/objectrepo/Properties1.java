package com.ramusoft.automation.appln.objectrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Properties1 {
	public static void main(String[] args) throws IOException {
		/*
		 * File file=new
		 * File("D:\\Selenium_workspace\\New10amBatch\\frameworks\\config.properties");
		 * FileInputStream readfile=new FileInputStream(file);
		 */
		FileInputStream readfile1=new FileInputStream("D:\\Selenium_workspace\\New10amBatch\\frameworks\\config.properties");
		
		Properties properties=new Properties();
		properties.load(readfile1);

		properties.setProperty("hello", "java");
		properties.put("java", "python");
		properties.setProperty("hordwork", "job");
		properties.put("me", "you");
		
		FileOutputStream fop = new FileOutputStream("D:\\Selenium_workspace\\New10amBatch\\frameworks\\config.properties");
		properties.store(fop, "File is saved ssss");
		
		/*
		 * String vall=properties.getProperty("qa_url"); System.out.println(vall);
		 * 
		 * String vall1=properties.getProperty("qa_username");
		 * System.out.println(vall1);
		 * 
		 * String vall2=properties.getProperty("qa_pwd"); System.out.println(vall2);
		 * 
		 * String vall3=properties.getProperty("qa_reports"); System.out.println(vall3);
		 * 
		 * String vall4=properties.getProperty("dev_url"); System.out.println(vall4);
		 * 
		 * Set setkey=properties.keySet(); for (Object obj : setkey) {
		 * 
		 * String key= (String) obj; String value=properties.getProperty(key);
		 * System.out.println(key+"   *********  "+value); }
		 */
		
	}

}
