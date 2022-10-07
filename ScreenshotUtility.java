package com.ramusoft.automatio.utilitis;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ramusoft.automaton.base.BaseTest;

public class ScreenshotUtility {
	
public static String takesecreenshot() throws IOException {
		
		TakesScreenshot takescreenshoot=(TakesScreenshot) BaseTest.getDriver();
		File file=takescreenshoot.getScreenshotAs(OutputType.FILE);
		String imagepath=(System.getProperty("user.dir")+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg");
		FileUtils.copyFile(file,new File(imagepath));
		return imagepath;
	}
	
	public static String takesecreenshot(String tcname) throws IOException {
		
		TakesScreenshot takescreenshoot=(TakesScreenshot) BaseTest.getDriver();
		File file=takescreenshoot.getScreenshotAs(OutputType.FILE);
		String imagepath=(System.getProperty("user.dir")+"\\Screenshots\\"+tcname+".jpeg");
		FileUtils.copyFile(file,new File(imagepath));
		return imagepath;
	}

}
