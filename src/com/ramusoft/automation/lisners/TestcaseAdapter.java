package com.ramusoft.automation.lisners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.ramusoft.automatio.utilitis.ScreenshotUtility;

public class TestcaseAdapter extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult arg0) {
	System.out.println("Test case is failure:"+arg0.getName());
	try {
		ScreenshotUtility.takesecreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test case is Skipped:"+arg0.getName());
		try {
			ScreenshotUtility.takesecreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("Test case is Success:"+arg0.getName());
	}

	

}
