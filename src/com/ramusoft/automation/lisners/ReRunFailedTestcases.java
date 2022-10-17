package com.ramusoft.automation.lisners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTestcases implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult arg0) {
		
		return false;
	}

}
