package com.vtiger.objectrepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtility.WebdDriverUtility;

public class HomePage extends WebdDriverUtility  {
	//dec
	@FindBy(xpath="//a[text()='Organizations']")private WebElement Organisationlnk;
	@FindBy(xpath="//a[text()='Contacts']")private WebElement Contactslnk;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement Administratorimg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement Signoutlnk;
	//intia
 
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//util

public WebElement getOrganisationlnk() {
	return Organisationlnk;
}

public WebElement getContactslnk() {
	return Contactslnk;
}

public WebElement getAdministratorimg() {
	return Administratorimg;
}

public WebElement getSignoutlnk() {
	return Signoutlnk;
}
//bl
public void clickonORglnk() {
	Organisationlnk.click();
}
public void clickoncontactsLnk() {
	Contactslnk.click();
}
public void logoutfromApp(WebDriver driver) {
	moveToElement(driver,Administratorimg);
	Signoutlnk.click();
}

}
