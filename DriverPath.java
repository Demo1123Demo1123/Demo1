package com.ramusoft.automatio.utilitis;

public interface DriverPath {
	
	String firefoxkey= "webdriver.gecko.driver";
	String firefoxvalue = System.getProperty("user.dir") +"\\Drivers\\geckodriver.exe";
	
	String edgekey= "webdriver.edge.driver";
	String edgevalue=System.getProperty("user.dir") +"\\Drivers\\msedgedriver.exe";
	
	String iekey= "webdriver.ie.driver";
	String ievalue=System.getProperty("user.dir") +"\\Drivers\\IEDriverServer.exe";
	
	String chromekey= "webdriver.chrome.driver";
	String chromevalue=System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
	
}
