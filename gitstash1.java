package com.ramusoft.automatio.utilitis;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

ath;
	}
	
	public static String takesecreenshot(String tcname) throws IOException {
		
		TakesScreenshot takescreenshoot=(TakesScreenshot) BaseTest.getDriver();
		File file=takescreenshoot.getScreenshotAs(OutputType.FILE);
		String imagepath=(System.getProperty("user.dir")+"\\Screenshots\\"+tcname+".jpeg");
		FileUtils.copyFile(file,new File(imagepath));
		return imagepath;
	}

}
