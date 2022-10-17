package com.ramusoft.automation.supports;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
	private String filepath;
	private FileInputStream fileinput;
	private Properties properties;
	private String value;
	
	public PropertiesReader(String filepath) throws IOException
	{
		this.filepath = filepath;
		fileinput=new FileInputStream(filepath);
		properties=new Properties();
		properties.load(fileinput);
		
	}
	public String getPropertyvalue(String key) {
		
	if (properties!=null)
	{
		value=properties.getProperty(key);
		
	}
	else 
	{
		System.out.println("get null value");
	}
		return value;

	}
		public String getPropertyvalue(String key,String defaultvalue) {
		
		if (properties!=null)
		{
			value=properties.getProperty(key);
			if (value==null) {
				value=defaultvalue;
			}
		}
		else 
		{
			System.out.println("get null value");
		}
			return value;

		}
		
		public String getPropertyvalue(Object key) {
		
		if (properties!=null)
		{
			value=(String) properties.get(key);
			
		}
		else 
		{
			System.out.println("get null value");
		}
			return value;

		}
		public String getPropertyvalue(Object key,Object defaultvalue) {
		
		if (properties!=null)
		{
			value=(String) properties.getOrDefault(key, defaultvalue);
			if (value==null) {
				value=(String) defaultvalue;
			}
		}
		else 
		{
			System.out.println("get null value");
		}
			return value;

		}
		
		public Set getAllkeys() {
			Set setkeys = null ;
			if (properties!=null) 
			{
				setkeys=properties.keySet();
				
			}	
			else {
				
				System.out.println("properts object is null........");
			}
			return setkeys;						
		}
		public List allValues() {
			
			Set keys=getAllkeys();
			List list1= new ArrayList<>();
			
			for(Object object : keys) {
				
				Object value=properties.get(object);
				list1.add(value);
			}
			return  list1;
		}
		public java.util.Map<String , String> getAllKeysValues() 
		{
			java.util.Map<String , String> mapkeyvalue=new LinkedHashMap<String, String>();
			Set keys=getAllkeys();
			for (Object object : keys) {
				
				String key= (String) object;
				value=properties.getProperty(key);
				mapkeyvalue.put(key, value);
				
			}
			return mapkeyvalue;
		}
		public void removekeyvalue(String key,String value) throws IOException {
		if (properties!=null) {
			properties.remove(key, value);
			FileOutputStream fileoutput=new FileOutputStream(filepath);
			properties.store(fileoutput, "file is saved ");
			
		}	
		else {
			
			System.out.println("properts object is null........");
		}
			

		}
		
		public void writekeyvalue(String key,String value) throws IOException {
			if (properties!=null) {
				properties.setProperty(key, value);
				FileOutputStream fileoutput=new FileOutputStream(filepath);
				properties.store(fileoutput, "file is saved ");
				
			}	
			else { 
				
				System.out.println("properts object is null........");
			}
			
				

			}
			
		
		public void writekeyvalue(Object key,Object value) throws IOException {
			if (properties!=null) {
				properties.put(key, value);
				FileOutputStream fileoutput=new FileOutputStream(filepath);
				properties.store(fileoutput, "file is saved ");
				
			}	
			else {
				
				System.out.println("properts object is null........");
			}
	
				

			}
		
		public void removevalue(String key) throws IOException {
			
			if (properties!=null) {
				properties.remove(key);
				FileOutputStream fileoutput=new FileOutputStream(filepath);
				properties.store(fileoutput, "file is saved ");
				
			}	
			else {
				
				System.out.println("properts object is null........");
			}
	
				

		}
		

}
	


