package com.ramusoft.automation.lisners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ramusoft.automatio.utilitis.ScreenshotUtility;

public class TestActivity implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		System.out.println("Suite excution is compleated");
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		System.out.println("Suite excution is Start");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

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
	public void onTestStart(ITestResult arg0) {
		
		System.out.println("Test case is Started:"+arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("Test case is Success:"+arg0.getName());
	}

}
