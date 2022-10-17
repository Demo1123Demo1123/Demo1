package com.ramusoft.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {

	public static void main(String[] args) {
		
		ExtentReports exreports=new ExtentReports("D:\\Selenium_workspace\\New10amBatch\\frameworks\\Reports\\repotrs.html");
		Map<String , String>map=new HashMap<String, String>();
		map.put("Name", "Ramu");
		map.put("Salary", "1800000");		
		map.put("Target", "job");
		
		exreports.addSystemInfo(map);
		ExtentTest extest =exreports.startTest("gmailtest");
		//ExtentTest extest =exreports.startTest("gmail","Demo");
		
		extest.log(LogStatus.PASS, " Browser is open ");
		extest.log(LogStatus.PASS, " Entered url as: www.gmail.com ");
		extest.log(LogStatus.PASS, " Dta is done on username with testdata:ramuinduri44@gmail.com ");
		extest.log(LogStatus.PASS, " Browser is closed ");
		exreports.endTest(extest);
		exreports.flush();
		exreports.close();
		
		
		

	}

}
