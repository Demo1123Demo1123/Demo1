package com.ramusoft.automaton.base;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ramusoft.automatio.utilitis.DriverPath;
import com.ramusoft.automatio.utilitis.ScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	
	private static  WebDriver driver;
	private static String tcname;
	private static ExtentReports exreports;
	private static  ExtentTest exttest;
	@Parameters({"Browser"})
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String Browser) {
		
		if (Browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty(DriverPath.firefoxkey,DriverPath.firefoxvalue);
			driver= new FirefoxDriver();
			init();
		}
		else if (Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty(DriverPath.chromekey,DriverPath.chromevalue);
			driver= new ChromeDriver();
			init();
			
		}
		else if (Browser.equalsIgnoreCase("ie")) {
			
			System.setProperty(DriverPath.iekey,DriverPath.ievalue);
			driver= new InternetExplorerDriver();
			init();
			
		}
		else if (Browser.equalsIgnoreCase("edge")) {
			
			System.setProperty(DriverPath.edgekey,DriverPath.edgevalue);
			driver= new EdgeDriver();
			init();
			
		}
		
	}
	public void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(44, TimeUnit.SECONDS);

	}
	@AfterSuite
	public void closeBrowser() {
		if (driver!=null) {
			driver.close();
		}
		else {
			
			System.out.println("driver is ponting to null");
		}
			
	}

	
	  @BeforeMethod 
	  public void BeforeTestcaseexcution(Method method) {
	  
	  tcname=method.getName();
	  System.out.println("current test case excution is"+tcname);
	  exttest=exreports.startTest(tcname);
	  exttest.log(LogStatus.PASS,"Current excutin test case test is pess: "+ tcname);
	  }
	  
	  @AfterMethod 
	  public void afterTestcaseexcution(ITestResult result) throws
	  IOException {
	  
	  String tcname=result.getName();
	  if (result.getStatus()==ITestResult.SUCCESS)
	  {
	  
	  System.out.println("Test case is pass "+tcname);
	  exttest.log(LogStatus.PASS, "Test case is pass "+tcname);
	  } 
	  else if(result.getStatus()==ITestResult.FAILURE)
	  {
		  
		  System.out.println("Test case is failure "+tcname); 
		  exttest.log(LogStatus.FAIL, "Test case is fail "+tcname);
		  exttest.log(LogStatus.FAIL,result.getThrowable());
		  String imagepath= ScreenshotUtility.takesecreenshot();
		  System.out.println("thowexception :"+result.getThrowable());
		  exttest.addScreenCapture(imagepath);
	  }
	  else if(result.getStatus()==ITestResult.SKIP)
	  { 
		  
		  System.out.println("Test case is Skip "+tcname);
		  exttest.log(LogStatus.SKIP, "Test case is Skip "+tcname);
		  exttest.log(LogStatus.SKIP,result.getThrowable());
		  String imagepath= ScreenshotUtility.takesecreenshot();
		  System.out.println("thowexception :"+result.getThrowable());
		  exttest.addScreenCapture(imagepath);
		  } 
	  exreports.endTest(exttest);
	  exreports.flush();
	  }
	 @BeforeTest
	  public void initextentreports() {
		
		  exreports=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\repotr.html");
		  

	}
	  
	  public void genarateReport() {
		
		  if (exreports!=null) {
			exreports.close();
		}
		  else {
			  
			  
		  }
	}
	  
	  
	  
	  
	  
	  
	  
	  
	public static WebDriver getDriver() {
		return driver;
	}
	public static String getTcName() {
		
		return tcname;
		
	}
	public static ExtentTest getExtentTest() {
		
		return exttest;
		
	}

}

