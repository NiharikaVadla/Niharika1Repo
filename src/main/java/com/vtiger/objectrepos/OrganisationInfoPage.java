package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage {
	//dec
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement orgheadertext;
	//intia
	public OrganisationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//ggetters
	public WebElement getOrgheadertext() {
		return orgheadertext;
	}
	//BL
	public String getheader() {
		return orgheadertext.getText();
		
	}
	
	

}
