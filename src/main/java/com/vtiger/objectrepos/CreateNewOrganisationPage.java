package com.vtiger.objectrepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisationPage {
	//dec
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgname;
	@FindBy(xpath="//input[@name='button']")private WebElement savebtn;
	//init
	public CreateNewOrganisationPage(WebDriver driver) {
		PageFactory .initElements(driver,this);
	}
	//util
	public WebElement getOrgname() {
		return orgname;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	//bl
	
	public void createNewOrganisation(String ORGNAME) {
		orgname.sendKeys(ORGNAME);
		savebtn.click();
		
	}
	
	

}
