package com.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebdDriverUtility {
	/**
	 * This method is used to maximize windows
	 * @param driver
	 * @author Niharika
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to minimize windows
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method wait till  entire webpage is loaded
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * This method is  used to handle the dropdown with help of Index 
	 * @param ele
	 * @param index
	 */
	public void handleDropDown(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	/**
	 * This method is  used to handle the dropdown with help of value
	 * @param ele
	 * @param value
	 */
	public void handleDropDown(WebElement ele,String value){
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	/**
	 * This method is  used to handle the dropdown with help of text
	 * @param text
	 * @param ele
	 */
	public void handleDropDown(String text,WebElement ele){
		Select s=new Select(ele);
		s.selectByVisibleText(text);
}
	/**
	 * This method is used to move the cursor
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform right click operation  
	 * @param driver
	 * @param element
	 */
	public void rightClickonelement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		
	}
	/**
	 * This method is used to click on element
	 * @param driver
	 * @param element
	 */
	public void doubleClickonelement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.click(element).perform();
   }
	/**
	 * This method is used for drag and drop purpose
	 * @param driver
	 * @param srcele
	 * @param destele
	 */
	public void dragandDrop(WebDriver driver,WebElement srcele,WebElement destele) {
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele, destele).perform();;
	}
	public void getscreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\Screenshotss\\vtiger.png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
}
