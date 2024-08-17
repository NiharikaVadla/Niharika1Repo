package com.vtiger.objectrepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	//dec
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement Imglnk;
	//init
public OrganisationPage(WebDriver driver) {
	PageFactory .initElements(driver,this);
}
//uit
public WebElement getImglnk() {
	return Imglnk;
}
//bl

public void clickoOnOrgLookUpImg() {
	Imglnk.click();
	}

}
