package com.ramusoft.autonation.pagecartobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ramusoft.automaton.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaptopsandNotebookspage extends BaseTest{
	
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private static WebElement LaptopsNotebooks ;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private static WebElement ShowAllLaptopsNotebooks ;
	
	@FindBy(xpath="//div[@class='list-group mb-3']/a[2]")
	private static WebElement actualLaptopsNotebookssize;
	
	@FindBys(@FindBy(xpath="//div[@class='product-thumb']/div/a/img"))
	private static List<WebElement> expectedLaptopsNotebookssize;
	
	
	public static void mouseoveronLaptopsNotebook() {
		
		try {
			
			Assert.assertTrue(LaptopsNotebooks.isDisplayed()&&LaptopsNotebooks.isEnabled());
			getExtentTest().log(LogStatus.PASS, "LaptopsNotebooks elements is displayed ");
			Actions actions=new Actions(getDriver());
			actions.moveToElement(LaptopsNotebooks).build().perform();
			getExtentTest().log(LogStatus.PASS, "mouse houre action on LaptopsNotebooks elements is displayed ");
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			
			getExtentTest().log(LogStatus.FAIL, "LaptopsNotebooks elements is Not displayed ");
		}
	}
	
	
	public static void clickonShowAllLaptopsNotebooks() {
		try {
			
			Assert.assertTrue(ShowAllLaptopsNotebooks.isDisplayed()&&ShowAllLaptopsNotebooks.isEnabled());
			getExtentTest().log(LogStatus.PASS, "ShowAllLaptopsNotebooks elements is displayed ");
			ShowAllLaptopsNotebooks.click();
			getExtentTest().log(LogStatus.PASS, "Click on ShowAllLaptopsNotebooks elements is displayed ");
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			
			getExtentTest().log(LogStatus.FAIL, "ShowAllLaptopsNotebooks elements is Not displayed ");
		}
		

	} 
	
	
	
	
	public static int getactualLaptopsNotebookssize() {
		
		int actualLaptopsize = 0;
		
		try {
			
			Assert.assertTrue(actualLaptopsNotebookssize.isDisplayed()&&actualLaptopsNotebookssize.isEnabled());
			getExtentTest().log(LogStatus.PASS, "actualLaptopsNotebookssize elements is displayed ");
			String text=actualLaptopsNotebookssize.getText();
			getExtentTest().log(LogStatus.PASS, "actualLaptopsNotebookssize"+text);
			String[] str=text.split(" ");
			String txt1=str[str.length-1];
			String[] txt2=txt1.split(" ");
			String actiualsize=txt2[1];
			actualLaptopsize=Integer.parseInt(actiualsize);
			
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			
			getExtentTest().log(LogStatus.FAIL, "LaptopsNotebooks elements is Not displayed ");
		}
		return actualLaptopsize;
		

	}
	
	public static int getexpectedLaptopsNotebookssize() {
		int expectedsize =0;
		
		try {
			
			expectedsize =expectedLaptopsNotebookssize.size();
			
		} catch (Exception e) {
			
			getExtentTest().log(LogStatus.FAIL, "expectedLaptopsNotebookssize elements is Not displayed ");
		}
		return expectedsize;

	}
	
	public static void VerifyLaptopsNotebookssize() {

		try {
			
		int actualsize=getactualLaptopsNotebookssize();
		int expectedsize=getexpectedLaptopsNotebookssize();
			if (actualsize==expectedsize) {
				getExtentTest().log(LogStatus.PASS, "LaptopsNotebookssize ");
			}
				else {
					getExtentTest().log(LogStatus.FAIL, "LaptopsNotebookssize ");
				}
			
		} catch (Exception e) {
			
			
		}

	}
	static
	{
		PageFactory.initElements(getDriver(), LaptopsandNotebookspage.class);
	}
	
}
