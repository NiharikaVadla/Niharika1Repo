package com.vtiger.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepos.HomePage;
import com.vtiger.objectrepos.LoginPage;

public class Base {
	public PropertyFileUtility putil=new PropertyFileUtility();
	public ExcelFileUtility eutil=new ExcelFileUtility();
	public JavaUtility jutil=new JavaUtility();
	WebdDriverUtility wutil=new WebdDriverUtility();
	//runtime polymorphism
	public WebDriver driver=null;
@BeforeSuite
public void bsconfig() {
	Reporter.log("==DB CONNECTION==",true);
}
@AfterSuite
public void ascofig() {
	Reporter.log("==DB DISCONNECTION==",true);
}
@BeforeClass
public void bcconfig() throws Throwable {
	String BROWSER = putil.readDatafromPf("browser");
	String URL = putil.readDatafromPf("url");
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
		Reporter.log("LAUNCHES CHROME",true);
	}
	else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
		Reporter.log("LAUNCHES EDGE",true);
	}
	else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
		Reporter.log("LAUNCHES FIREFOX",true);
	}
	else {
		System.out.println("Invalid browser name propertyfile");
	}
	driver.get(URL);
	wutil.maximizeWindow(driver);
	wutil.waitForPageLoad(driver);
	
}
@AfterClass
public void teardown() {
	driver.quit();
	Reporter.log("==CLOSE BROWSER",true);
}
@BeforeMethod
public void loginToApp() throws Throwable {
	String UN = putil.readDatafromPf("un");
	String PWD = putil.readDatafromPf("pwd");
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(UN, PWD);
	Reporter.log("login from app",true);
}
@AfterMethod
public void logoutfromApp() {
	HomePage hp=new HomePage(driver);
	hp.logoutfromApp(driver);
	Reporter.log("logout from app",true);
	
}

}
